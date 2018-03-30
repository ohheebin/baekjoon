/**
 * Created by heebin on 2018. 3. 30..
 */
//9507 Generations of Tribbles
import java.util.*;
public class Main_9507 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;
        long[] dp = new long[69];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if(max <= arr[i]){
                max = arr[i];
            }
        }


        for(int i = 0; i <= max; i++){
            if(i < 2){
                dp[i] = 1;
            }else if(i == 2){
                dp[i] = 2;
            }else if(i == 3){
                dp[i] = 4;
            }else{
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4];
            }
        }

        for(int i = 0; i < N; i++){
            System.out.println(dp[arr[i]]);
        }

    }
}
