import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int[] x = {-1,0,1};
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++) {
            String str = "";
            long n = sc.nextLong();
            while (true) {
                if (n == 0) {
                    break;
                }
                int check = (int) (n % 2);
                str += Integer.toString(check);

                n /= 2;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}







