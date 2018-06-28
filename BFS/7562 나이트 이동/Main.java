import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    //나이트 이동
    private static int[] ch_x = {2,2,-2,-2,1,1,-1,-1}; // 하 상 좌 우
    private static int[] ch_y = {1,-1,1,-1,2,-2,2,-2};

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        LinkedList<Integer> result = new LinkedList<>();
        for(int i = 0; i < t; i++){
            LinkedList<Integer> x_ch = new LinkedList<>();
            LinkedList<Integer> y_ch = new LinkedList<>();

            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            int x = sc.nextInt();
            int y = sc.nextInt();
            int x_point = sc.nextInt();
            int y_point = sc.nextInt();
            arr[x][y] = 1;
            x_ch.add(x);
            y_ch.add(y);
            int num = 1;
            int ans = 0;

            boolean check = false;
            while(true){
                int temp = 0;
                while(num != 0){
                    num--;
                    int a = x_ch.pollFirst();
                    int b = y_ch.pollFirst();
                    if(a == x_point && b == y_point){
                        check = true;
                        break;
                    }
                    for(int j = 0; j < 8; j++){
                        if(a+ch_x[j] >= 0 && a+ch_x[j] <= n-1 && b+ch_y[j] >= 0 && b+ch_y[j] <= n-1){
                            if(arr[a+ch_x[j]][b+ch_y[j]] == 0){
                                temp++;
                                arr[a+ch_x[j]][b+ch_y[j]] = 1;
                                x_ch.add(a+ch_x[j]);
                                y_ch.add(b+ch_y[j]);
                            }
                        }
                    }
                }
                if(check == true){
                    break;
                }
                num = temp;
                ans++;
            }
            result.add(ans);
        }
        while(!result.isEmpty()){
            System.out.println(result.pollFirst());
        }
    }
}

