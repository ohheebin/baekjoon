import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        long R = sc.nextLong();
        long B = sc.nextLong();

        long x = 0;
        long y = 0;
        long L = 3;
        long W = 3;
        // 항상 L이 W 보다 크거나 같다
        // x는 사각형의 가장자리의 수 y는 나머지 사각형의 수 
        while(true){
            x = (L*2) + ((W-2)*2);
            y = (L*W) - x;
            if(x == R && y == B){
                break;
            }

            W++;
            if(W > L){
                W = 3;
                L++;
            }
        }
        System.out.println(L+" "+W);
    }
}

