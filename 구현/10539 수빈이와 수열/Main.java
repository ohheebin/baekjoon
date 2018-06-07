import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] list = new long[n+1];
        long[] result = new long[n+1];
        for(int i = 1; i <= n; i++){
            list[i] = sc.nextLong();
        }
        result[1] = list[1];

        for(int i = 2; i <= n; i++){
            long lo = 0;
            for(int j = 1; j < i; j++){
                lo += result[j];
            }
            result[i] = (list[i] * i) - lo;
        }

        for(int i = 1; i <= n; i++){
            System.out.print(result[i]);
            if(i != n){
                System.out.print(" ");
            }
        }
    }
}


