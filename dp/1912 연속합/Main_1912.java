/**
 * Created by heebin on 2018. 2. 15..
 */

import java.util.Scanner;

public class Main_1912 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] list = new int[num];
        int result = -1000000000;

        for(int i = 0; i < num; i++){
            list[i] = sc.nextInt();
        }

        for(int i = 0; i < num; i++){
            int max = 0;
            int sum = list[i];
            max = list[i];
            for(int j = i+1; j < num; j++){
                sum = sum + list[j];
                if(max < sum){
                    max = sum;
                }
            }
            if(result < max){
                result = max;
            }
        }

        System.out.print(result);
    }
}
