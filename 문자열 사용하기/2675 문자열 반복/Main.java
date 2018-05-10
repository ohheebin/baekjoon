import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        int[] r = new int[n];

        for(int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
            str[i] = sc.next();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < str[i].length(); j++){
                for(int k = 0; k < r[i]; k++){
                    System.out.print(str[i].charAt(j));
                }
            }
            if(i < n - 1) {
                System.out.println();
            }
        }

    }
}
