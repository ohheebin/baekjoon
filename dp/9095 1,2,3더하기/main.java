/**
 * Created by heebin on 2017-01-05.
 */
//1, 2, 3 더하기
import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] check = new int[num];
        int[] number = new int[12];
        for(int i = 0; i < num; i++){
            check[i] = sc.nextInt();
        }
        number[1] = 1;
        number[2] = 2;
        number[3] = 4;
        for(int j = 4; j < number.length; j++){
            number[j] = (number[j-1] + number[j-2] + number[j-3]);
        }

        for(int k = 0; k < num; k++){
            System.out.println(number[check[k]]);
        }
    }

}


