/**
 * Created by heebin on 2017-01-05.
 */
import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = sc.nextInt();
        int[] score = new int[num];
        for(int i = 0; i < num; i++){
            score[i] = sc.nextInt();
        }
        for(int j = 0; j < num; j++){
            if(score[j] < x){
                System.out.print(score[j] +" ");
            }
        }
    }
}


