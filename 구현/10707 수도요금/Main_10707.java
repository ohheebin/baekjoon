/**
 * Created by heebin on 2018. 2. 18..
 */
import java.util.*;

public class Main_10707 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();

        int a_p = a * p;
        int b_p = 0;

        if(p <= c){
            b_p = b;
        } else{
            b_p = b + (d * (p - c));
        }

        if(b_p > a_p){
            System.out.println(a_p);
        }else{
            System.out.println(b_p);
        }

    }
}
