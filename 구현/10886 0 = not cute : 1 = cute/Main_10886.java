/**
 * Created by heebin on 2017. 10. 6..
 */
import java.util.*;
public class Main_10886 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int check = 0;
        int zero = 0;
        int one = 0;

        for(int i = 0; i < num; i++){
            check = sc.nextInt();
            if(check == 1){
                one += 1;
            }else if(check == 0){
                zero += 1;
            }
        }
        if(one > zero){
            System.out.println("Junhee is cute!");
        }else{
            System.out.println("Junhee is not cute!");
        }

    }
}