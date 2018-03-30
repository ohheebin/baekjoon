/**
 * Created by heebin on 2018. 3. 28..
 */
//1009 분산처리
import java.util.*;

public class Main_1009 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] a = new int[T];
        int[] b = new int[T];

        for(int i = 0; i < T; i++){
            a[i] = sc.nextInt() % 10;
            b[i] = sc.nextInt();
        }

        for(int i = 0; i < T; i++){
            int result = 1;
            for(int j = 0; j < b[i]; j++){
                result = (result * a[i]) % 10;
            }
            if(result == 0){
                result = 10;
            }
            System.out.println(result);
        }

    }
}
