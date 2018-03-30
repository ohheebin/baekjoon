/**
 * Created by heebin on 2018. 3. 28..
 */
//보물
import java.util.*;
public class Main_1026 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] A = new int[T];
        int[] B = new int[T];
        int[] A_dp = new int[T];
        int[] B_dp = new int[T];
        int sum = 0;
        int check_A = 0;
        int check_B = 0;

        for(int i = 0; i < T; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < T; i++){
            B[i] = sc.nextInt();
        }

        for(int j = 0; j < T; j++) {
            int min = 101;
            int max = 0;
            for (int i = 0; i < T; i++) {
                if (min > A[i] && A_dp[i] != 1) {
                    min = A[i];
                    check_A = i;
                }

                if (max < B[i] && B_dp[i] != 1) {
                    max = B[i];
                    check_B = i;
                }
            }
            A_dp[check_A] = 1;
            B_dp[check_B] = 1;
            sum = sum + (min * max);
        }
        System.out.println(sum);

    }
}
