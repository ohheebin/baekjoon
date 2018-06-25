import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] arr = new long[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }
        int size = n-1;
        int count = 0;
        while(k != 0){
            if(arr[size] <= k){
                k -= arr[size];
                count++;
            }else{
                size--;
            }
        }

        System.out.println(count);
    }
}

