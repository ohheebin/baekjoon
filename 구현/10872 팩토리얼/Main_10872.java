/**
 * Created by heebin on 2017. 10. 6..
 */
import java.util.*;
public class Main_10872 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        long ans = 1;

        for(int i = 1; i <= num; i++){
            ans = ans * i;
        }
        System.out.println(ans);

    }
}
