import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 2;

        for(int i = 1; i <=n; i++){
            x += (x-1);
        }

        System.out.println(x*x);
    }
}


