import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 5; // 1일때 5 -> 10 -> 15
        long sub = 3; // 빼야할 점의 수 처음에는 3 -> 5 -> 7
        long mod = 45678;

        for(int i = 2; i <= n; i++){
            sum += (5*i) - sub;
            sub += 2;
            sum = sum % mod;
        }

        System.out.println(sum);

    }
}


