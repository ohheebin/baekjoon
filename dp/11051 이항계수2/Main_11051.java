/**
 * Created by heebin on 2018. 2. 16..
 */
import java.util.*;

public class Main_11051 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] dp = new int[n+1][n+1];
        dp[1][0] = 1;
        dp[1][1] = 1;

        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % 10007;
                }
            }
        }
        System.out.println(dp[n][k]);

    }
}
