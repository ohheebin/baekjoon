import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int max = 0;
        int result = 0;
        for(int i = 0; i < m; i++){
            int k = sc.nextInt();
            for(int j = 0; j < n; j++){
                if(num[j] <= k){
                    arr[j]++;
                    if(max < arr[j]){
                        max = arr[j];
                        result = j+1;
                    }
                    break;
                }
            }
        }
        System.out.println(result);
    }
}


