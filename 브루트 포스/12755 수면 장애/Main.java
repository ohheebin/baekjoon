import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long i = 1;
        long count = 0;
        String str = "";
        while(true){
            str = Long.toString(i);
            count += str.length();
            if(count >= n){
                System.out.println(str.charAt((str.length() - 1) - (int)(count-n)));

                break;
            }
            i++;
        }
    }
}


