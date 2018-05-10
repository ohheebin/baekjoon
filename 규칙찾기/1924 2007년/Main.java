/**
 * Created by heebin on 2017. 10. 3..
 */
//1924번 2007년
import java.util.*;
public class Main16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = y;

        for(int i = 0; i < x; i++){
            sum += month[i];
        }
        System.out.println(day[sum%7]);
    }
}
