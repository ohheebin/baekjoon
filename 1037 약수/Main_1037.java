/**
 * Created by heebin on 2018. 3. 29..
 */
//약수
import java.util.*;
public class Main_1037 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        int min = 10000001;
        int max = 0;

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] <= min){
                min = arr[i];
            }

            if(arr[i] >= max){
                max = arr[i];
            }
        }

        int result = min * max;

        System.out.println(result);
    }
}
