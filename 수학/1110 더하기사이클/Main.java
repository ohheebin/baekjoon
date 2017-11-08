//더하기 사이클
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int one = 0, two = 0, result = 0, temp2 = 0, temp = number;
        int num;

        if(number == 0){
            num = 1;
        } else {
            for (num = 0; number != temp2; num++) {
                one = temp / 10;
                two = temp % 10;
                result = one + two;
                temp = (two * 10) + (result % 10);
                temp2 = temp;
            }
        }
        System.out.println(num);
    }
}
