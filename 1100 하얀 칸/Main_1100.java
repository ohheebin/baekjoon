/**
 * Created by heebin on 2018. 3. 29..
 */
//하얀 칸
import java.util.*;

public class Main_1100 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[8][8];
        int[][] dp = new int[8][8];//1은 검정 0은 흰
        String[] N = new String[8];
        int result = 0;

        for(int i = 0; i <= 7; i++) {
            N[i] = sc.nextLine();
        }

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                arr[i][j] = N[i].charAt(j);
                if((i + j) % 2 == 1){
                    dp[i][j] = 1;
                }

                if(dp[i][j] == 0 && arr[i][j] == 'F'){
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
