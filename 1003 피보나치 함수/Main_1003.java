/**
 * Created by heebin on 2018. 3. 28..
 */
//피보나치 함수
import java.util.*;

public class Main_1003 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[][] fibonacci = new long[41][2];
        int[] N = new int[num];
        fibonacci[0][0] = 1;
        fibonacci[0][1] = 0;
        fibonacci[1][0] = 0;
        fibonacci[1][1] = 1;

        for(int i = 2; i <= 40; i++){
            fibonacci[i][0] = fibonacci[i-1][0] + fibonacci[i-2][0];
            fibonacci[i][1] = fibonacci[i-1][1] + fibonacci[i-2][1];
        }

        for(int i = 0; i < num; i++){
            N[i] = sc.nextInt();
        }

        for(int j = 0; j < num; j++){
            System.out.println(fibonacci[N[j]][0] + " " + fibonacci[N[j]][1]);
        }

    }
}
//63245986 102334155