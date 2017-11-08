/**
 * Created by heebin on 2017. 9. 27..
 */
//점화식 문제 이친수 2193번
import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] dp = {1,1,1};

        //점화식 문제가 되기 떄문에 1 1 2 3 5 8 .... 배열 3개만 있으면 된다
        for(int i = 2; i < num; i++) {
            dp[2] = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        System.out.print(dp[2]);
    }
}

