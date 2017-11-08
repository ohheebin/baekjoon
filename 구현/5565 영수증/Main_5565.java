/**
 * Created by heebin on 2017. 10. 6..
 */
import java.util.*;
public class Main_5565 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] list = new int[10];


        for(int i = 0; i < 10; i++){
            list[i] = sc.nextInt();
        }
        int ans = list[0];
        for(int i = 1; i < 10; i++){
            ans = ans - list[i];
        }
        System.out.println(ans);
    }
}