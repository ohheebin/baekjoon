/**
 * Created by heebin on 2017. 10. 2..
 */
//11048번 이동하기
import java.util.*;
public class Main11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] list = new int[x][y];
        long[][] dp = new long[x+1][y+1];

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++) {
                list[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                dp[i+1][j+1] = Math.max(Math.max(dp[i][j],dp[i+1][j]),dp[i][j+1]) + list[i][j];
            }
        }

        System.out.println(dp[x][y]);

    }
}
