/**
 * Created by heebin on 2018. 3. 30..
 */
//10164 격자상의 경로
import java.util.*;

public class Main_10164 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc. nextInt();
        int k = sc.nextInt();

        int[][] dp = new int[N+1][M+1];

        int x = 0;
        int y = 0;
        int count = 0;
        //k의 x,y 좌표를 알아낸다
        for(int i = 1; i <=N; i++){
            for(int j = 1; j <= M; j++){
                count++;
                if(k == count){
                    x = i;
                    y = j;
                    break;
                }
            }
            if(k == count){
                break;
            }
        }
        //알아낸 좌표로 i가 x보다 작거나 j가 y보다 큰경우와 i가 x보다 크거나 j가 y보다 작은 경우에는 갈필요가 없다
        dp[0][1] = 1;
        for(int i = 1; i <=N; i++){
            for(int j = 1; j <= M; j++) {
                if((i < x && j > y) || (i > x && j < y)){
                    dp[i][j] = 0;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        System.out.println(dp[N][M]);

    }
}
