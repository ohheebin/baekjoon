import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] str = new String[n];
        sc.nextLine();

        for(int i = 0; i < n; i++){
            str[i] = sc.nextLine();
        }

        int x = sc.nextInt();
        int y = sc.nextInt();
        int row = (2*n) - 1;
        Character[][] arr = new Character[2*n][2*m];

        for(int i = 0; i < 2*n; i++){
            int len = m-1;
            for(int j = 0; j < 2*m; j++){

                if(i < n){
                    if(j < m){
                        arr[i][j] = str[i].charAt(j);
                    }else{
                        arr[i][j] = str[i].charAt(len);
                        len--;
                    }
                }else{
                    if(j < m){
                        arr[i][j] = str[row].charAt(j);
                    }else{
                        arr[i][j] = str[row].charAt(len);
                        len--;
                    }
                }
                if(i + 1 == x && j + 1 == y) {
                    int ch = arr[i][j];
                    int ch2 = '.';
                    if (ch == ch2) {
                        arr[i][j] = '#';
                    } else {
                        arr[i][j] = '.';
                    }
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
            row--;
        }
    }
}


