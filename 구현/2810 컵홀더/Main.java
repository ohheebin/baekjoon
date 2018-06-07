import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "";
        sc.nextLine();

        str = sc.nextLine();

        int L = 0;
        for(int i = 0; i < str.length(); i++){
            int x = str.charAt(i);
            int y = 'L';
            if(x == y){
                L++;
            }
        }
        int result = ((n + 1) - (L / 2));
        if(result > n){
            // 만약 컵홀더의 수 보다 앉아 있는 사람이 더 적다면 최대 사람은 n이 된다
            System.out.println(n);
        }else {
            System.out.println(result);
        }
    }
}


