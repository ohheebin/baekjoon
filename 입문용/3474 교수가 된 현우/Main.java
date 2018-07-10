import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //뒤에 있는 0의 갯수는 5의 제곱승들을 m 값으로 나눈 것들을 더하면 된다
        for(int i = 0; i < n; i++){
            long m = sc.nextLong();
            long result = 0;
            for(int j = 5; j <= m; j *= 5){
                result += (m / j);
            }
            System.out.println(result);
        }
    }
}







