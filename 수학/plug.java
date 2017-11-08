/**
 * Created by heebin on 2017-01-05.
 */
import java.util.*;
public class plug {
    public static void main(String[] args) {

        int multNum = 0;
        Scanner sc = new Scanner(System.in);
        multNum =sc.nextInt();
        int[] multCount = new int[multNum];
        int count = 0;
        int output = 0;
        for(int i = 0; i < multNum; i++){
            multCount[i] = sc.nextInt();
            count = count + multCount[i];
        }

        output = count - (multNum - 1);

        System.out.println(output);
    }
}
