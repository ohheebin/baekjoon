/**
 * Created by heebin on 2017. 10. 6..
 */
import java.util.*;
public class Main_5543 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] list = new int[5];
        int min = 10000;
        for(int i = 0; i < 5; i++){
            list[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            min = Math.min(min,Math.min((list[i]+list[3])-50,(list[i]+list[4])-50));
        }
        System.out.println(min);
    }
}
