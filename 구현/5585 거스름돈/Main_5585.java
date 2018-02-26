/**
 * Created by heebin on 2018. 2. 18..
 */
import java.util.*;

public class Main_5585 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int answer = 1000 - num;
        int count = 0;

        while(answer > 0){
            if(answer >= 500){
                count++;
                answer = answer - 500;
            } else if(answer >= 100 && answer < 500){
                count++;
                answer = answer - 100;
            } else if(answer >= 50 && answer < 100){
                count++;
                answer = answer - 50;
            } else if(answer >= 10 && answer < 50){
                count++;
                answer = answer - 10;
            } else if(answer >= 5 && answer < 10){
                count++;
                answer = answer - 5;
            } else{
                count++;
                answer = answer - 1;
            }
        }
        System.out.println(count);
    }
}
