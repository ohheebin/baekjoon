/**
 * Created by heebin on 2017. 10. 2..
 */
//11057 오르막수
import java.util.*;
public class Main12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] dp = new int[num][10];
        int ans = 0;
        for(int i = 0; i < 10; i++){
            dp[0][i] = 1;
        }
        //0부터 i-1의 0~9의 합 1은 1~9....
        for(int i = 1; i < num; i++){
            for(int j = 0; j < 10; j++){
                for(int k = j; k < 10; k++){
                    dp[i][j] = (dp[i][j] + dp[i-1][k]) % 10007;
                }
            }
        }

        for(int i = 0; i < 10; i++){
            ans += dp[num-1][i];
        }
        System.out.println(ans % 10007);

    }
}
