import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][3];
        int[] num = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < n; j++){
                boolean ch = true;
                for(int k = 0; k < n; k++){
                    if(j != k){
                        if(arr[j][i] == arr[k][i]){
                            num[j] += 0;
                            ch = false;
                            break;
                        }
                    }
                }
                if(ch == true){
                    num[j] += arr[j][i];
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(num[i]);
        }
    }
}


