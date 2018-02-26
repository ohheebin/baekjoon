/**
 * Created by heebin on 2018. 2. 18..
 */
import java.util.*;

public class Main_2884 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int x = 0;
        int y = 0;


        if(m < 45){
            x = h - 1;
            y = 60 - 45 + m;
            if(x < 0){
                x = 23;
            }
        }else{
            x = h;
            y = m - 45;
        }

        System.out.println(x + " " + y);
    }
}
