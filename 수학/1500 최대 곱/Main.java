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

        int[] num = new int[m];

        int x = n / m;
        int y = n % m;
        long mul = 1;

        for(int i = 0; i < m; i++){
            num[i] = x;
        }
        for(int j = 0; j < y; j++){
            num[j] += 1;
        }

        for(int i = 0; i < m; i++){
            mul *= num[i];
        }
        System.out.println(mul);
    }
}

