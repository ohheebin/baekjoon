/**
 * Created by heebin on 2017. 10. 5..
 */
import java.util.*;
public class Main_1699 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] dp = new int[num+1];
        int check = 1;
        //제곱수를 나눈값과 그 나머지에 해당하는 dp가 제곱수의 최소항이다
        //반례 48 = 3 이 나와야한다 이를 위해 check를 1개씩 줄여가며 최소항을 구해낸다
        for(int i = 1; i <= num; i++){
            if((check*check) <= i && ((check+1)*(check+1)) > i){
                if(i > 3){
                    dp[i] = (i / (check*check)) + dp[i % (check*check)];
                    for(int j = check - 1; j >= 1; j--) {
                        dp[i] = Math.min(((i / (j * j)) + dp[i % (j * j)]), dp[i]);
                    }
                }else{
                    dp[i] = (i / (check*check)) + dp[i % (check*check)];
                }
            }else{
                check += 1;
                dp[i] = (i / (check*check)) + dp[i % (check*check)];
            }
        }

        System.out.println(dp[num]);
    }
}
