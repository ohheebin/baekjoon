/**
 * Created by heebin on 2017. 10. 5..
 */
import java.util.*;
public class Main_9465 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] ans = new int[num];

        for(int i = 0; i < num; i++){
            int n = sc.nextInt();
            int[][] list = new int[2][n];
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < n; k++){
                    list[j][k] = sc.nextInt();
                }
            }

            int[][] dp = new int[2][n+2];

            for(int x = 2; x < n + 2; x++){
                for(int y = 0; y < 2; y++){
                    if(y == 0){
                        dp[0][x] = list[0][x - 2] + Math.max(Math.max(dp[1][x - 1], dp[0][x - 2]),dp[1][x-2]);
                    } else{
                        dp[1][x] = list[1][x - 2] + Math.max(Math.max(dp[0][x - 1], dp[1][x - 2]),dp[0][x-2]);
                    }
                }
            }
            ans[i] = Math.max(dp[0][n+1], dp[1][n+1]);

        }

        for(int i = 0; i < num; i++){
            System.out.println(ans[i]);
        }
    }
}
