/**
 * Created by heebin on 2017-01-05.
 */
//2 x n 타일 문제
//피보나치와 같은 식의 경우의 수가 나옴  1 2 3 5 8 13 21 .....
import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] check = new long[num];
        check[0] = 1;

        if(num >= 2) {
            check[1] = 2;
            for (int i = 2; i < num; i++){
                check[i] = ((check[i - 1] + check[i - 2]) % 10007);//10007으로 나눈 나머지 값을 출력하는 것이기 때문..... 배열에 넣을떄
                                                                    //계산해야지 값이 제대로 나온다.
            }
        }
        System.out.println(check[num-1]);
    }

}


