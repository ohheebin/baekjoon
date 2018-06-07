import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);

        long sum = 0;
        long m = sc.nextLong();
        long n = sc.nextLong();
        String str = "";
        boolean ch = true;
        for(long i = 1; i <= m; i++){
            str = Long.toString(i);
            sum += str.length();
            if(sum == n){
                System.out.println(str.charAt(str.length()-1));
                ch = false;
                break;
            }else if(sum > n){
                int x = (int)(sum - n);
                System.out.println(str.charAt((str.length()-1)-x));
                ch = false;
                break;
            }
        }

        if(sum < n && ch == true){
            System.out.println(-1);
        }
    }
}


