/**
 * Created by heebin on 2017-01-05.
 */
import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] west = new int[num];
        int[] east = new int[num];
        for(int i = 0; i < num; i++){
            west[i] = sc.nextInt();
            east[i] = sc.nextInt();
        }
        for(int j = 0; j < num; j++){
            System.out.println((int)test(west[j], east[j]));
        }
    }

    public static double test(int westNum, int eastNum){
        double eastA = 1;
        double eastB = eastNum;
        double westB = westNum;
        for(int i = 0; i < westNum; i++){
            eastA = eastA * (eastB / westB);
            eastB--;
            westB--;
        }
        return Math.round(eastA);
    }
}


