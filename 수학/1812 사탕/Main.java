import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];
        long[] result = new long[n];
        long sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
            // 홀수 번쨰의 합은 빼주고 짝수 번째의 합을 더해주면 마지막 합이 2a가 된다.
            if(i % 2  == 0){
                sum += arr[i];
            }else{
                sum -= arr[i];
            }
        }
        //a의 값을 구해주고 주어진 합들을 빼주면 사탕의 수를 구해낼수 있다.
        result[0] = sum / 2;
        System.out.println(result[0]);
        for(int i = 0; i < n - 1; i++){
            result[i+1] = arr[i] - result[i];
            System.out.println(result[i+1]);
        }
    }
}

