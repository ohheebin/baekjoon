/**
 * Created by heebin on 2017. 9. 27..
 */
//1149 RGB거리 구하기
import java.util.*;
public class Main2 {
    public static void main(String args[]){
        //입력하기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] list = new int[num][3];
        int[][] dp = new int[num][3];
        for(int i = 0; i < num; i++){
            for(int j = 0; j < 3; j++){
                int price = sc.nextInt();
                list[i][j] = price;
                if(i == 0){
                    dp[i][j] = list[i][j];
                }
            }
        }
        //DP로 더한값을 dp list에 저장한다
        for(int i = 1; i < num; i++){
            for(int j = 0; j < 3; j++){
                int min_num = 1000000;
                for(int k = 0; k < 3; k++){
                    if (k != j){
                        if(min_num > dp[i-1][k]){
                            min_num = dp[i-1][k];
                        }
                    }
                }
                dp[i][j] = list[i][j] + min_num;
            }
        }
        //마지막에 나온값중 가장 작은 값을 ans로 한다
        int ans = min(dp[num-1][0],dp[num-1][1],dp[num-1][2]);
        System.out.println(ans);
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
