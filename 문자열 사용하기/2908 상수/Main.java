import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int reverse_n = 0;
        int reverse_m = 0;

        reverse_n = (n / 100) + (((n % 100) / 10) * 10) + (((n % 100) % 10) * 100);
        reverse_m = (m / 100) + (((m % 100) / 10) * 10) + (((m % 100) % 10) * 100);

        if(reverse_n > reverse_m){
            System.out.println(reverse_n);
        }else{
            System.out.println(reverse_m);
        }

    }
}
