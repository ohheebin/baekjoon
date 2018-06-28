import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int[] ch_x = {1,-1,0,0}; // 하 상 좌 우
    private static int[] ch_y = {0,0,-1,1};

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];
        int max = 0;
        LinkedList<Integer> x = new LinkedList<>();
        LinkedList<Integer> y = new LinkedList<>();
        int result = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                arr[i][j] = sc.nextInt();
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        //비가 안온날부터 가장높은 높이 보다 -1 까지
        for(int i = 0; i < max; i++){
            int num = 0;
            int[][] list = new int[n+2][n+2]; // 잠긴 지역 0 안잠긴 지역 1
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    if(arr[j][k] > i){
                        list[j][k] = 1; // 안잠긴 지역 체크
                    }
                }
            }
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    if(list[j][k] == 1){
                        x.add(j);
                        y.add(k);
                        num++;
                        list[j][k] = 0;
                        while(!x.isEmpty()){
                            int a = x.pollFirst();
                            int b = y.pollFirst();
                            for(int l = 0; l < 4; l++){
                                if(list[a+ch_x[l]][b+ch_y[l]] == 1){
                                    x.add(a+ch_x[l]);
                                    y.add(b+ch_y[l]);
                                    list[a+ch_x[l]][b+ch_y[l]] = 0;
                                }
                            }
                        }
                    }
                }
            }
            if(result < num){
                result = num;
            }
        }
        System.out.println(result);
    }
}

