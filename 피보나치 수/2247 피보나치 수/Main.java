import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 0;
        int y = 1;
        int z = 0;

        for(int i = 2; i <= n; i++){
            z = x + y;
            x = y;
            y = z;
        }

        if(n == 0){
            System.out.println(x);
        }else if(n == 1){
            System.out.println(y);
        }else{
            System.out.println(z);
        }
    }
}
