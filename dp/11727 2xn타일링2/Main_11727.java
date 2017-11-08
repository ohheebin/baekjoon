/**
 * Created by heebin on 2017. 10. 5..
 */
//11727번 2xn 타일링 2
import java.util.*;
public class Main_11727 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] dp = {0,1,1};

        for(int i = 1; i < num; i++){
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = (dp[1] + (2 * dp[0])) % 10007;
        }

        System.out.println(dp[2]);

    }
}
