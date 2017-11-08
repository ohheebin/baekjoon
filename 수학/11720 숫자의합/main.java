/**
 * Created by heebin on 2017-01-05.
 */
import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        for(int i = 0; i < num; i++){
            sum = sum + ((int)str.charAt(i)-48);
        }
        System.out.println(sum);
    }
}


