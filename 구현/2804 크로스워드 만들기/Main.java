import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int x = 0;
        int y = 0;
        boolean ch = false;

        for(int i = 0; i < A.length(); i++){
            for(int j = 0; j < B.length(); j++){
                x = A.charAt(i);
                y = B.charAt(j);
                if(x == y){
                    x = i;
                    y = j;
                    ch = true;
                    break;
                }
            }
            if(ch == true){
                break;
            }
        }

        for(int i = 0; i < B.length(); i++){
            for(int j = 0; j < A.length(); j++){
                if(i != y){
                    if(j == x){
                        System.out.print(B.charAt(i));
                    }else{
                        System.out.print(".");
                    }
                } else{
                    System.out.print(A.charAt(j));
                }
            }
            System.out.println();
        }
    }
}


