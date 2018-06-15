import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < m; k++){
                    arr[j][k] += sc.nextInt();
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]);
                if(j != m-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


