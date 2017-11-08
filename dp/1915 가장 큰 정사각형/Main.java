/**
 * Created by heebin on 2017. 9. 27..
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // write your code hereo
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] list = new int[x][y];
        int[][] dp = new int[x+1][y+1];

        int max_num = 0;
        for(int i = 0; i < x; i++){
            String num = sc.next();
            for(int j = 0; j < y; j++){
                list[i][j] = (int)num.charAt(j) - 48;
            }
        }

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(list[i][j] == 1){
                    dp[i+1][j+1] = min(dp[i][j],dp[i+1][j],dp[i][j+1]) + 1;
                }
                if(max_num < dp[i+1][j+1]){
                    max_num = dp[i+1][j+1];
                }
            }
        }
        System.out.print(max_num * max_num);
    }

    public static int min(int a, int b, int c){
        int min_num = 0;
        if(a < b){
            min_num = a;
        }else{
            min_num = b;
        }

        if(min_num > c){
            min_num = c;
        }

        return min_num;
    }
}
