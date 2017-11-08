/**
 * Created by heebin on 2017. 9. 28..
 */
//1890번 점프
import java.util.*;
public class Main8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] board = new int[num][num];
        long[][] dp = new long[num][num]; // long으로 해줘야 큰값이 나와도 제대로 출력가능
        dp[0][0] = 1;

        for(int i=0; i < num; i++){
            for(int j=0; j < num; j++){
                board[i][j] = sc.nextInt();
            }
        }
        //우측과 하단으로 밖에 이동할 수 없기에... 옮긴 위치의 값과 옮기기전의 위치의 값을 더해준다
        for(int i = 0; i <num; i++){
            for(int j = 0; j < num; j++) {
                if(i == num - 1 && j == num - 1){
                    System.out.println(dp[num-1][num-1]);
                    break;
                }
                if(dp[i][j] != 0){
                    if(num > i + board[i][j]){
                        dp[i+board[i][j]][j] += dp[i][j];
                    }

                    if(num > j + board[i][j]){
                        dp[i][j+board[i][j]] += dp[i][j];
                    }
                }
            }
        }
        /*
        for(int i = 0; i <num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println(" ");
        }
        */
    }
}
