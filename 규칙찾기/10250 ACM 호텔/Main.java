import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++){
            int h = sc.nextInt(); // 층수
            int t = sc.nextInt(); // 방수
            int host = sc.nextInt(); // 손님 수
            int a = 1;
            int b = 1;

            for(int j = 1; j < host; j++){
                if(a == h){
                    b++;
                    a = 1;
                }else{
                    a++;
                }
            }
            list[i] = (a * 100) + b;
        }

        for(int i = 0; i < n; i++){
            System.out.println(list[i]);
        }
    }
}
