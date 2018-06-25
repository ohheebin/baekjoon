import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;
        int result = 0;
        int[] arr = new int[10001];

        for(int i = 1; i <= 10000; i++){
            for(int j = i; i * j <= 10000; j++){
                arr[i*j]++;
            }
        }

        for(int i = 1; i <= n; i++){
            result += arr[i];
        }

        System.out.println(result);
    }
}


