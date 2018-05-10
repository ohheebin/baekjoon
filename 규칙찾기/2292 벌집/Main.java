import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long num = 1;
        int i = 0;

        while(true){
            num = num + (6 * i);
            i++;
            if(num >= n){
                System.out.println(i);
                break;
            }
        }
    }
}
