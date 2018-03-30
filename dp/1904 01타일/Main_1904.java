/**
 * Created by heebin on 2018. 3. 30..
 */
//1904 01타일 피보나치 문제이다.
import java.util.*;

public class Main_1904 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] dp = new int[1000000];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= N; i++){
            dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
        }

        System.out.println(dp[N]);
    }
}
