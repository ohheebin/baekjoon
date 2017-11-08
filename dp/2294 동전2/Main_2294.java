/**
 * Created by heebin on 2017. 10. 5..
 */
import java.util.*;
public class Main_2294 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int price = sc.nextInt();
        int[] coin = new int[num];
        int[] dp = new int[price+1];

        for(int i = 0; i < num; i++){
            coin[i] = sc.nextInt();
        }
        //dp값을 10001로 초기화
        for(int i = 1; i <= price; i++){
            dp[i] = 10001;
        }

        for(int i = 0; i < num; i++){
            for (int j = coin[i]; j <= price; j++) {
                if(dp[j % coin[i]] == 0 && j%coin[i] != 0){
                    dp[j] = dp[j];
                }else {
                    for(int k = j / coin[i]; k >= 1; k--) {
                        dp[j] = Math.min(dp[j], ((k) + dp[j - k * coin[i]]));
                    }
                }
            }
        }
        //dp값이 10001이면 그것은 동전으로 값을 채울수 없다는 의미
        if(dp[price] == 10001) {
            System.out.println(-1);
        }else{
            System.out.println(dp[price]);
        }
    }
}
