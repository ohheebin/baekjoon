/**
 * Created by heebin on 2018. 5. 3..
 */
import java.util.*;
public class Main_8958 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] list = new int[num];


        for(int i = 0; i < num; i++){
            String check = "";
            check = sc.next();
            int k = 0;
            int sum = 0;

            for(int j = 0; j < check.length(); j++){
                if(check.charAt(j) == 'O'){
                    k++;
                    sum = sum + k;
                }else{
                    k = 0;
                }
            }
            list[i] = sum;
        }

        for(int i = 0; i < num; i++){
            System.out.println(list[i]);
        }
    }
}
