import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        //나머지와 몫이 같은 수는 자기 자신+1 한 값의 배수 인데 n-1까지의 배수
        for(int i = 1; i <= n-1; i++){
            sum += (n+1) * i;
        }

        System.out.println(sum);

    }
}


