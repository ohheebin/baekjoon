import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);

        long sum = 0;
        long m = sc.nextLong();
        String str = "";
        for(long i = 1; i <= m; i++){
            str = Long.toString(i);
            sum += str.length();
        }

        System.out.println(sum);
    }
}


