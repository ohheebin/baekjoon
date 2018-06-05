import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];
        long min = 100000001;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
            if(min > arr[i]){
                min = arr[i];
            }
        }

        for(long i = 1; i <= min; i++){
            boolean ch = true;
            for(int j = 0; j < n; j++){
                if(arr[j] % i != 0){
                    ch = false;
                    break;
                }
            }
            if(ch == true){
                System.out.println(i);
            }
        }
    }
}


