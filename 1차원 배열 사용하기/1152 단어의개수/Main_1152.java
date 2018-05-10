/**
 * Created by heebin on 2018. 5. 3..
 */
import java.util.*;
public class Main_1152 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String matter = sc.nextLine();
        int num = 1;

        for(int i = 1; i < matter.length(); i++){
            if(matter.charAt(i) == ' ' && matter.charAt(i - 1) != ' '){
                num++;
            }
        }
        if(matter.charAt(matter.length() - 1) == ' '){
            num--;
        }
        if(matter.length() == 0){
            num = 0;
        }

        System.out.println(num);
    }
}
