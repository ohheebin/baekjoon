import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 64;
        int count = 1;
        int x = 64;
        while(true){
            if(x == n){
                break;
            }
            num /= 2;
            x = x - num;
            count++;
            if(x < n){
                x = x + num;
            }else{
                count--;
            }
        }

        System.out.println(count);
    }
}
