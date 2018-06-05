import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int temp = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                temp = arr[i];
                temp += arr[j];
                for(int k = j+1; k < n; k++){
                    if(temp + arr[k] <= m){
                        if(max < temp + arr[k]){
                            max = temp + arr[k];
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}


