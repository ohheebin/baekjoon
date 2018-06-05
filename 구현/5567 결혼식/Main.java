import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int[][] arr = new int[m][2];
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i = 0; i < m; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            //1번과 친구인 사람들을 1로 만들어 준다
            if(arr[i][0] == 1){
                dp[arr[i][1]] = 1;
            }else if(arr[i][1] == 1){
                dp[arr[i][0]] = 1;
            }
        }
        //1번과 친구인 사람의 친구들을 2로 만들어 줘서 친구의 친구를 체크한다
        for(int i = 0; i < m; i++){
            if(dp[arr[i][0]] == 1){
                if(dp[arr[i][1]] == 0){
                    dp[arr[i][1]] = 2;
                }
            }else if(dp[arr[i][1]] == 1){
                if(dp[arr[i][0]] == 0){
                    dp[arr[i][0]] = 2;
                }
            }
        }
        for(int i = 2; i <= n; i++){
            if(dp[i] <= 2 && dp[i] != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}


