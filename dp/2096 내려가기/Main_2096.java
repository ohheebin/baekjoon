/**
 * Created by heebin on 2017. 10. 6..
 */
import java.util.*;
public class Main_2096 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] list = new int[num][3];
        int[][] max_dp = new int[num+1][3];
        int[][] min_dp = new int[num+1][3];

        for(int i = 0; i < num; i++){
            for(int j = 0; j < 3; j++){
                list[i][j] = sc.nextInt();
            }
        }

        for(int i = 1; i <= num; i++){
            for(int j = 0; j < 3; j++){
                if(j == 0){
                    max_dp[i][j] = Math.max(max_dp[i-1][j],max_dp[i-1][j+1]) + list[i-1][j];
                    min_dp[i][j] = Math.min(min_dp[i-1][j],min_dp[i-1][j+1]) + list[i-1][j];
                }else if(j == 1){
                    max_dp[i][j] = Math.max(max_dp[i-1][j-1], Math.max(max_dp[i-1][j],max_dp[i-1][j+1])) + list[i-1][j];
                    min_dp[i][j] = Math.min(min_dp[i-1][j-1], Math.min(min_dp[i-1][j],min_dp[i-1][j+1])) + list[i-1][j];
                }else{
                    max_dp[i][j] = Math.max(max_dp[i-1][j],max_dp[i-1][j-1]) + list[i-1][j];
                    min_dp[i][j] = Math.min(min_dp[i-1][j],min_dp[i-1][j-1]) + list[i-1][j];
                }
            }
        }

        System.out.print(Math.max(max_dp[num][0], Math.max(max_dp[num][1],max_dp[num][2])) + " ");
        System.out.println(Math.min(min_dp[num][0], Math.min(min_dp[num][1],min_dp[num][2])));

    }
}
