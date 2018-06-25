import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int[] arr;
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long sum = 0;
        long count = 0;
        for(long i = 1; i <= n/2; i++){
            sum = i;
            for(long j = i+1; j <= n; j++){
                sum += j;
                if(sum == n){
                    count++;
                    break;
                }else if(sum > n){
                    break;
                }
            }
        }
        System.out.println(count+1);
    }
}

