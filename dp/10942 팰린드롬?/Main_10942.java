/**
 * Created by heebin on 2018. 3. 30..
 */
//10942 팰린드롬?
import java.util.*;

public class Main_10942 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[][] dp = new int[2002][2002];

        int i = 1;
        int j = 1;

        //dp를 1 1 -> 1 2 -> 2 2 -> 1 3 -> 2 3 -> 3 3 순으로 훑어간다
        //i 와 j의 배열이 같고 dp[i+1][j - 1]의 값이 0(팰린드롬)이면 그 위치도 팰린드롬이다
        while(true){

            if(arr[i] == arr[j] && dp[i+1][j-1] == 0){
                dp[i][j] = 0;
            }else{
                dp[i][j] = 1;
            }

            if(i == j){
                i = 1;
                j++;
            }else{
                i++;
            }
            if(i == N && j == N){
                break;
            }
        }

        for (int k = 0; k < M; k++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            if(dp[start][end] == 0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}

