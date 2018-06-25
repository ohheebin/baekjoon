import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long result = 0;

        sc.nextLine();
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            String temp = "";

            for(int j = 0; j < str.length()-1; j++){
                temp += str.charAt(j);
            }

            long x = Integer.valueOf(temp);
            int y = Integer.valueOf(str.charAt(str.length()-1)) - 48;
            long num = 1;

            for(int j = 1; j <= y; j++){
                num *= x;
            }
            result += num;
        }
        System.out.println(result);
    }
}


