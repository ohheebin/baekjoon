import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        sc.nextLine();
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            for(int j = 0; j < str.length(); j++){
                int ch = 'c';
                if((int)str.charAt(j) == ch){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = -1;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 1; j < m; j++){
                if(arr[i][j-1] != -1 && arr[i][j] == -1){
                    arr[i][j] = arr[i][j-1]+1;
                }
            }
            for(int j = 0; j < m; j++){
                if(j != m -1) {
                    System.out.print(arr[i][j] + " ");
                }else{
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
}


