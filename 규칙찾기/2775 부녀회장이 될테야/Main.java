import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];
        int[][] dp = new int[15][15];

        for(int i = 1; i <= 14; i++){
            dp[0][i] = i;
        }

        for(int i = 1; i <= 14; i++){
            for(int j = 1; j <= 14; j++){
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[i] = dp[a][b];
        }

        for(int i = 0; i < n; i++){
            System.out.println(list[i]);
        }
    }
}
