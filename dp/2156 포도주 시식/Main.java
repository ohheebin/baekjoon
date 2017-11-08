/**
 * Created by heebin on 2017. 9. 28..
 */
//2156 포도주 시
import java.util.*;
public class Main6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] list = new int[num+1];
        int[] dp = new int[num+1];

        for(int i = 1; i <= num; i++){
            list[i] = sc.nextInt();
        }
        if(num == 1){
            System.out.println(list[1]);
        } else if(num == 2){
            System.out.println(list[1] + list[2]);
        } else {
            dp[1] = list[1];
            dp[2] = list[1] + list[2];
            //num번째의 포도주를 안먹는 경우와 num번쨰 포도주 + dp[num-2]의 최대값과 num과 그 앞의 포도주 + dp[num-3]의 포도주의 최대값 비교
            for (int i = 3; i <= num; i++) {
                dp[i] = max(max((list[i] + dp[i - 2]),dp[i - 1]), (dp[i - 3] + list[i-1] + list[i]));
            }
            System.out.println(dp[num]);
        }
    }

    public static int max(int a, int b){
        if(a > b) {
            return a;
        } else{
            return b;
        }
    }
}
