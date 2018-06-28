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

        int T = sc.nextInt();
        LinkedList<Integer> result = new LinkedList<>();
        for(int i = 0; i < T; i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();
            LinkedList<Integer> x_point = new LinkedList<>();
            LinkedList<Integer> y_point = new LinkedList<>();
            int[][] arr = new int[n+2][m+2];
            int num = 0;
            for(int j = 0; j < k; j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[b+1][a+1] = 1;
            }
            //배열을 확인하면서 배추가 존재하면 그 배추와 인접한 배추들을 2로 만들어 주고 지렁이(num)를 1증가시킨다
            for(int x = 1; x <= n; x++){
                for(int y = 1; y <= m; y++){
                    if(arr[x][y] == 1){
                        num++;
                        arr[x][y] = 2;
                        int check = 1;
                        //처음 배추가 있는 위치를 list에 저장한다
                        x_point.add(x);
                        y_point.add(y);
                        //인접한 배추들을 찾아서 2로 저장시킨다
                        while(check != 0){
                            int x_int = x_point.pollFirst();
                            int y_int = y_point.pollFirst();
                            check--;
                            for(int l = 0; l < 4; l++){
                                if(arr[x_int+ch_x[l]][y_int+ch_y[l]] == 1){
                                    arr[x_int+ch_x[l]][y_int+ch_y[l]] = 2;
                                    check++;
                                    x_point.add(x_int+ch_x[l]);
                                    y_point.add(y_int+ch_y[l]);
                                }
                            }
                        }
                    }
                }
            }
            //지렁이의 수를 저장한다
            result.add(num);
        }
        while(!result.isEmpty()){
            System.out.println(result.pollFirst());
        }
    }
}

