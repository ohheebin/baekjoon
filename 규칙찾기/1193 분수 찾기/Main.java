import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        int num = 1;
        int i = 2;
        int a = 1;
        int b = 1;
        if(n != 1) {
            while (true) {
                num += i;
                if(n <= num){
                    if(i % 2 == 0){
                        a = i;
                        b = 1;
                    }else{
                        a = 1;
                        b = i;
                    }
                    break;
                }
                i++;
            }
            if(a == 1){
                for(int j = num; j > n; j--) {
                    a = a + 1;
                    b = b - 1;
                }
            }else{
                for(int j = num; j > n; j--) {
                    a = a - 1;
                    b = b + 1;
                }
            }
        }
        System.out.println(a+"/"+b);
    }
}
