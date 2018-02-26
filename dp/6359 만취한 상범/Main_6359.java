/**
 * Created by heebin on 2018. 2. 15..
 */
import java.util.*;

public class Main_6359 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] num_list = new int[num];

        int k = 0;

        for(int i = 0; i < num; i++){
            int test = sc.nextInt();
            int[] room = new int[101];
            int count = 0;

            for(int j = 2; j <= test; j++){
                int plus = j;
                for(k = j; k <= test; ){
                    if(room[k] == 0) {
                        room[k] = 1;
                    }else{
                        room[k] = 0;
                    }
                    k = k + plus;
                }
            }

            for(int j = 1; j <=test; j++){
                if(room[j] == 0){
                    count++;
                }
            }
            num_list[i] = count;
        }

        for(int i = 0; i < num; i++){
            System.out.println(num_list[i]);
        }

    }
}
