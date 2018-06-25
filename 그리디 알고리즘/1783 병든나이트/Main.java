import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long result = 0;
        if(n == 1){
            result = 1;
        }else if(n == 2){
            result = Math.min(4,(m+1)/2);
        }else if(n >= 3 && m <= 6){
            result = Math.min(4,m);
        }else{
            result = m-2;
        }

        System.out.println(result);
    }
}

