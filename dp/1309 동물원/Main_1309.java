/**
 * Created by heebin on 2017. 10. 6..
 */
import java.util.*;
public class Main_1309 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] dp = new int[num+1];
        dp[0] = 1;
        dp[1] = 3;

        for(int i = 2; i <= num; i++){
            dp[i] = ((2 * dp[i - 1]) + dp[i - 2]) % 9901;
        }

        System.out.println(dp[num]);
    }

}
