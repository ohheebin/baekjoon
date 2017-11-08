/**
 * Created by heebin on 2017. 10. 3..
 */
//3053번 택시 기하
import java.util.*;
public class Main_3053 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        double circle = (Math.PI * num * num);
        double geometry = Math.pow(num,2) + Math.pow(num,2);//택시 기하학에서 원은 마름모 모양의 정사각형이다.

        System.out.printf("%.6f\n",circle);
        System.out.printf("%.6f",geometry);
    }
}
