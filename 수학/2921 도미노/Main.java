import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++){
            //도미노의 칸은 2개 첫번째 칸의 갯수가 증가할때마다 최대 점의 수는 첫번째칸 * 2
            for(int j = i; j <= i*2; j++){
                sum += j;
            }
        }

        System.out.println(sum);

    }
}

