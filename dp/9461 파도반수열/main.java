/**
 * Created by heebin on 2017-01-05.
 */
//파도반 수열 문제....
//6번째 자리부터 -1과 -5의 합의 값과 같다.
import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] result = new int[num];
        for(int i = 0; i < num; i++) {
            result[i] = sc.nextInt();
        }
        long[] check = new long[100];
        check[0] = 1;
        check[1] = 1;
        check[2] = 1;
        check[3] = 2;
        check[4] = 2;

        for(int j = 5; j < 100; j++){
            check[j] = check[j-5] + check[j-1];
        }

        for(int k = 0; k < num; k++){
            System.out.println(check[result[k]-1]);
        }
    }
}


