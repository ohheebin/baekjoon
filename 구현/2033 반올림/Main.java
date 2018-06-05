import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        String result = n;

        if(Integer.valueOf(n) > 10) {
            int[] arr = new int[n.length()+1];
            for(int i = 1; i <= n.length(); i++){
                arr[i] = Integer.valueOf(Character.toString(n.charAt(i-1)));
            }
            for (int i = n.length(); i >= 2; i--) {
                if(arr[i] >= 5){
                    arr[i] = 0;
                    arr[i-1]++;
                    if(arr[i-1] == 10){
                        arr[i-1] = 0;
                        arr[i-2]++;
                    }
                }else{
                    arr[i] = 0;
                }
            }
            if(arr[0] != 0){
                System.out.print(arr[0]);
            }
            for(int i = 1; i < n.length()+1; i++) {
                System.out.print(arr[i]);
            }
        }else{
            System.out.println(n);
        }
    }
}


