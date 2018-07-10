import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[][] result = new int[n][n];
        long sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
                result[i][j] = arr[i][j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = 0; k < n; k++){
                    if(j != k && arr[i][j] > arr[i][k] + arr[k][j]){
                        System.out.println(-1);
                        return ;
                    }

                    if(arr[i][j] == arr[i][k] + arr[k][j] && k != i && j != k){
                        result[i][j] = 0;
                    }
                }
                if(result[i][j] != 0){
                    sum += result[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}

