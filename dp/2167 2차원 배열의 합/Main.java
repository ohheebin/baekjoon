/**
 * Created by heebin on 2017. 9. 28..
 */
//2167번 2차원 배열의 합
import java.util.*;
public class Main5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] list = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                list[i][j] = sc.nextInt();
            }
        }

        int num = sc.nextInt();
        int[][] dp = new int[num][5];

        for(int i = 0; i < num; i++){
            for(int j = 0; j < 4; j++){
                dp[i][j] = sc.nextInt();
                if(j == 3){
                    int sum = 0;
                    for(int k = (dp[i][0] - 1); k < dp[i][2]; k++){
                        for(int g = (dp[i][1] - 1); g < dp[i][3]; g++){
                            sum = sum + list[k][g];
                        }
                    }
                    dp[i][4] = sum;
                }
            }
        }

        for(int i = 0; i < num; i++){
            System.out.println(dp[i][4]);
        }
    }
}
