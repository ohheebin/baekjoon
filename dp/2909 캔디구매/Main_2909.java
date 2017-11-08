/**
 * Created by heebin on 2017. 10. 3..
 */
//2909번 캔디구매
import java.util.*;
public class Main_2909 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long price = sc.nextInt();
        int zero_num = sc.nextInt();
        long ans = 0;
        double num = Math.pow(10,zero_num);

        if((price % (long)num) >= (long)num/2){
            ans = (price/(long)num) * (long)num + (long)num;
        }else{
            ans = (price/(long)num) * (long)num;
        }

        System.out.println(ans);
    }
}
