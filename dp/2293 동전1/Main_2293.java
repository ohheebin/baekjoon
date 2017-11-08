/**
 * Created by heebin on 2017. 10. 5..
 */
import java.util.*;
public class Main_2293 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int price = sc.nextInt();
        int[] coin = new int[num];
        long[] dp = new long[price+1];
        dp[0] = 1;

        for(int i = 0; i < num; i++){
            coin[i] = sc.nextInt();
            for(int j = coin[i]; j <= price; j++){
                dp[j] = dp[j] + dp[j - coin[i]];
            }
        }

        System.out.println(dp[price]);
    }
}
