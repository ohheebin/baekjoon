import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int num = n - 1;
        int k = 0;

        for(int i = 1; i < n; i++){
            if(num % i == 0){
                k = num / i;
                if(k - 1 == i){
                    break;
                }
            }
        }
        System.out.println(k-1);
    }
}


