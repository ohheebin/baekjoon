/**
 * Created by heebin on 2017. 9. 29..
 */
//2193번 이친수
import java.util.*;
public class Main10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long[][] dp = new long[num][2];
        dp[0][0] = 0;
        dp[0][1] = 1;

        for(int i = 0; i < num - 1; i++ ){
            for(int j = 0; j < 2; j++){
                if(dp[i][j] != 0){
                    if(j == 0){
                        dp[i+1][j] += dp[i][j];
                        dp[i+1][j+1] += dp[i][j];
                    } else{
                        dp[i+1][j-1] += dp[i][j];
                    }
                }
            }
        }
        System.out.println(dp[num-1][0] + dp[num-1][1]);
    }
}
