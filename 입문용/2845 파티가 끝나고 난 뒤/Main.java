import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int[] x = {-1,0,1};
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //1m^2 당 사람의 수
        int m = sc.nextInt(); //파티장의 넓이
        long[] result = new long[5];
        for(int i = 0; i < 5; i++){
            long k = sc.nextLong();

            result[i] = k - (n*m);
        }

        for(int i = 0; i < 5; i++){
            System.out.print(result[i] + " ");
        }
    }
}







