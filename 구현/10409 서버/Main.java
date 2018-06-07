import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] list = new int[n];

        for(int i = 0; i < n; i++){
            list[i] = sc.nextInt();
        }

        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            sum += list[i];
            if(sum > t){
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}


