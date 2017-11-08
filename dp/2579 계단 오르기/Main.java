/**
 * Created by heebin on 2017. 9. 28..
 */
//2579번 계단 오르기
import java.util.*;
public class Main7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] list = new int[num+1];
        int[] dp = new int[num+1];

        for(int i = 1; i <= num; i++){
            list[i] = sc.nextInt();
        }
        if(num == 1){
            System.out.println(list[num]);
        } else if(num == 2){
            System.out.println(list[1] + list[2]);
        } else{
            dp[1] = list[1];
            dp[2] = list[1] + list[2];
            //3칸의 계단을 연달아 밟을수 없고 마지막 계단을 무조건 밟아야 한다
            for(int i = 3; i <= num; i++){
                dp[i] = Math.max((dp[i-3] + list[i-1] + list[i]), (dp[i-2] + list[i]));
            }
            System.out.println(dp[num]);
        }
    }
}
