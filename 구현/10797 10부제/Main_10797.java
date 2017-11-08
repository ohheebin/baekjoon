/**
 * Created by heebin on 2017. 10. 6..
 */
import java.util.*;
public class Main_10797 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < 5; i++){
            int car = sc.nextInt();

            if(day == car){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
