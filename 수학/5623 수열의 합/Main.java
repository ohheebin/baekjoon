import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[][] arr = new long[n][n];
        long[] num = new long[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextLong();
            }
        }
        if(n > 2) {
            // ((a + b) - c) / 2 를 통해 첫번쨰 수열을 찾아 내고 배열에서 첫번쨰 수를 빼나가면서 값을 구해나간다
            long a = arr[0][1];
            long b = arr[0][2];
            long c = arr[1][2];

            num[0] = ((a + b) - c) / 2;

            for (int i = 1; i < n; i++) {
                num[i] = arr[0][i] - num[0];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(num[i]);
                if (i != n - 1) {
                    System.out.print(" ");
                }
            }
        }else{
            // 수열이 두개라면 나올 수 있는 수열은 1 1 뿐이다
            System.out.print("1 1");
        }
    }
}

