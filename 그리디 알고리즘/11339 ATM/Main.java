import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Integer> arr = new LinkedList<>();

        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        long sum = 0;
        long temp = 0;
        for(int i = 0; i < n; i++){
            int k = arr.poll();
            temp += k;
            sum += temp;
        }

        System.out.println(sum);
    }
}

