/**
 * Created by heebin on 2017. 10. 3..
 */
//10039번 평균점수
import java.util.*;
public class Main15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            if(num < 40){
                sum += 40;
            }else{
                sum += num;
            }
        }

        System.out.println(sum / 5);
    }
}
