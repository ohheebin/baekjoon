/**
 * Created by heebin on 2017. 9. 29..
 */
//10844번 쉬운 계단수
import java.util.*;
public class Main9 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        long[][] dp = new long[num][10];
        long ans = 0;

        for (int i = 1; i < 10; i++) {
            dp[0][i] = 1;
        }
        //2차원 배열을 통해 그 자리의 숫자가 몇번씩 나오는지를 저장한다 위의 배열에 나온 값을 더해 내려간다
        for(int i = 0; i < num - 1; i++){
            for(int j = 0; j < 10; j++){
                dp[i][j] = dp[i][j] % 1000000000;

                if(dp[i][j] != 0){
                    if(j > 0 && j < 9){
                        dp[i+1][j - 1] = dp[i][j];
                        dp[i+1][j + 1] += dp[i][j];
                    } else if(j == 0){
                        dp[i+1][j + 1] += dp[i][j];
                    } else{
                        dp[i+1][j - 1] += dp[i][j];
                    }
                }
            }
        }

        for(int i = 0; i < 10; i++){
            ans = (ans + dp[num-1][i]) % 1000000000;
        }
        System.out.println(ans);

    }
}
