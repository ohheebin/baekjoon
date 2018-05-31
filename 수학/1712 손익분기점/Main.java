import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long count = 0;
        long sum = a;

        // 손익분기점은 a 를 b-c 만큼 더해가면서 0보다 작으면 이익
        if(b >= c){
            System.out.println(-1);
        }else {
            while (sum >= 0) {
                sum += b - c;
                count++;
            }
            System.out.println(count);
        }
    }
}


