/**
 * Created by heebin on 2017. 9. 29..
 */
//1932번 숫자삼각형
import java.util.*;
public class Main10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] list = new int[num][num];
        long[][] dp = new long[num+1][num+1];
        long max_num = 0;

        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                list[i][j] = sc.nextInt();
            }
        }
        //dp의 좌측위와 바로위의 값중 큰값을 현재 list의 값과 비교해서 최대값 저장
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                dp[i+1][j+1] = Math.max(dp[i][j], dp[i][j+1]) + list[i][j];
                max_num = Math.max(max_num,dp[i+1][j+1]);
            }
        }

        System.out.println(max_num);
    }
}
