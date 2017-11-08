/**
 * Created by heebin on 2017. 9. 27..
 */
//11052번 붕어빵 판매하기
import java.util.*;
public class Main4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] list = new int[num+1];
        int[] dp = new int[num+1];
        dp[0] = 0;
        for(int i = 1; i <= num; i++){
            list[i] = sc.nextInt();
        }
        //dp에 1개 부터 ~ num개 까지 각각 그 갯수만큼의 최대값을 저장
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                dp[i] = max(dp[i], dp[i - j] + list[j]);
            }
        }
        System.out.println(dp[num]);
    }

    public static int max(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
}
