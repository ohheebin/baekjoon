import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[80000];
        long count = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] <= arr[j]){
                    break;
                }else{
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


