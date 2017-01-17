/**
 * Created by heebin on 2017-01-05.
 */
import java.util.*;
public class main{
    public static int one = 0, zero = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] score = new int[num];
        for(int i = 0; i < num; i++){
            score[i] = sc.nextInt();
        }
        for(int j = 0; j < num; j++){
            fibonacci(score[j]);
            System.out.println(zero + " " + one);
            one = 0;
            zero = 0;
        }
    }

    public static int fibonacci(int n){
        if(n == 0) {
            zero++;
            return 0;
        } else if(n == 1){
            one++;
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


