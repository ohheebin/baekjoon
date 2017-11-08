/**
 * Created by heebin on 2017-01-05.
 */
import java.util.*;
public class main{
    public static int one = 0, zero = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int[] score = new int[3];
        for (int i = 0; i < 3; i++) {
            score[i] = sc.nextInt();
        }

        if(score[0] <= score[1]){
            if(score[1] <= score[2]){
                result = score[1];
            } else{
                if(score[0] <= score[2]){
                      result = score[2];
                } else{
                      result = score[0];
                }
            }
        } else{
            if(score[0] <= score[2]){
                result = score[0];
            } else{
                if(score[1] <= score[2]){
                    result = score[2];
                } else{
                    result = score[1];
                }
            }
        }
        System.out.println(result);
    }
}


