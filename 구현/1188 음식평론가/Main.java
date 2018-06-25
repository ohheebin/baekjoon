import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(m - gcd(n,m));
    }

    private static int gcd(int a, int b){
        if( b == 0 ){
            return a;
        }
        return gcd(b, a%b);
    }
}

