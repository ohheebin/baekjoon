/**
 * Created by heebin on 2017. 10. 6..
 */
import java.util.*;
public class Main_1965 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] list = new int[num];
        int[] dp = new int[num];
        int ans = 0;

        for(int i = 0; i < num; i++){
            list[i] = sc.nextInt();
            dp[i] = 1;
        }

        for(int i = 1; i < num; i++){
            for(int j = 0; j < i; j++){
                if(list[i] > list[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            ans = Math.max(dp[i], ans);
        }
        System.out.println(ans);
    }
}
