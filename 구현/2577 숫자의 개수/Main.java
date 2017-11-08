/**
 * Created by heebin on 2017. 10. 2..
 */
//2577번 숫자의 개수
import java.util.*;
public class Main14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long num = a * b * c;
        int[] list = new int[10];
        int k = 0;

        for(long i = num; i > 0; i = i / 10){
            k = (int)(i % 10);
            list[k] += 1;
        }

        for(int i = 0; i < 10; i++){
            System.out.println(list[i]);
        }
    }
}
