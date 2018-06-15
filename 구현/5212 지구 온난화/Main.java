import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+2][m+2]; //바다면 0 땅이면 1
        int[][] dp = new int[n+2][m+2];
        int check = 'X';
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            String str = sc.nextLine();
            for(int j = 1; j <= str.length(); j++){
                if((int)str.charAt(j-1) == check){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }
            }
        }
        //땅이 줄어드는 것을 확인하기 위한 변수
        int x_min = 100;
        int x_max = 0;
        int y_min = 100;
        int y_max = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                int count = 0;
                if(arr[i-1][j] == 0){
                    count++;
                }
                if(arr[i][j-1] == 0){
                    count++;
                }
                if(arr[i+1][j] == 0){
                    count++;
                }
                if(arr[i][j+1] == 0){
                    count++;
                }

                if(count >= 3 || arr[i][j] == 0){
                    dp[i][j] = 0;
                }else{
                    dp[i][j] = 1;
                    if(x_min > i){
                        x_min = i;
                    }
                    if(x_max < i){
                        x_max = i;
                    }
                    if(y_min > j){
                        y_min = j;
                    }
                    if(y_max < j){
                        y_max = j;
                    }
                }
            }
        }
        for(int i = x_min; i <= x_max; i++){
            for(int j = y_min; j <= y_max; j++){
                if(dp[i][j] == 0){
                    System.out.print(".");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }

    }
}


