import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int num = sc.nextInt();
            long sum = 1;
            long k = 1;
            for(int j = 1; j < num; j++){
                k *= 2;
                sum += k;
            }

            System.out.println(sum);
        }
    }
}


