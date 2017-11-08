/**
 * Created by heebin on 2017. 10. 6..
 */
import java.util.*;
public class Main_11055 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] list = new int[num];
        int[] dp = new int[num];
        int ans = 0;
        for(int i = 0; i < num; i++){
            list[i] = sc.nextInt();
            dp[i] = list[i];
        }

        ans = list[0];
        for(int i = 1; i < num; i++){
            for(int j = 0; j < i; j++){
                if(list[i] > list[j]){
                    dp[i] = Math.max(dp[i], list[i]+dp[j]);
                }
            }
            ans = Math.max(ans,dp[i]);
        }
        System.out.println(ans);
    }
}
