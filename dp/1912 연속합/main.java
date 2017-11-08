/**
 * Created by heebin on 2017-01-05.
 */
//연속합
import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] check = new int[num];

        for(int i = 0; i < num; i++){
            check[i] = sc.nextInt();
        }

        System.out.println(result(num, check));
    }
    // 0 부터 num까지 더해가면서 큰값을 저장하고 다음으로 1 부터 num까지 계속해서 num하나만을때까지
    //더한 값들을 계산한다.
    public static int result(int num, int[] check){
        int number = -1000;//가장 작은값
        int sum;
        int k = 0;
        for(int i = num; i >= 1; i--){
            sum = 0;
            for(int j = 0; (k + j) < num; j++){
                sum += check[k + j];//하나씩 더해가면서 값을 비교한다.
                if(sum >= number){
                    number = sum;
                }
            }
            k++;
        }
        return number;
    }
}


