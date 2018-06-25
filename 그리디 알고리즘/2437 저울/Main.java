import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }

        long sum = 1;
        Arrays.sort(arr);
        /*
        n개의 저울을 다 사용한 무게 < 새로운 저울 이면 그 사이에 존재하는 무게는 잴 수 없다.
        n개의 저울을 사용하여 잴 수 있는 무게는 그 이전 무게 또한 부분 개수의 저울을 이용하여 잴 수 있다.
         */
        for(int i = 0; i < n; i++){
            if(sum < arr[i]){
                break;
            }
            sum += arr[i];
        }

        System.out.println(sum);
    }
}

