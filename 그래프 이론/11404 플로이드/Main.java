import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int[] ch_x = {-1,0,1,0};
    private static int[] ch_y = {0,-1,0,1};
    private static int n,m;
    private static int[][] arr, list;
    private static int ans;
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        n = Integer.valueOf(bw.readLine()); // 도시 수
        arr = new int[n+1][n+1]; // 도시의 최소 비용
        m = Integer.valueOf(bw.readLine());

        for(int i = 0; i < m; i++){
            String[] str = bw.readLine().split(" ");
            int x = Integer.valueOf(str[0]);
            int y = Integer.valueOf(str[1]);
            int c = Integer.valueOf(str[2]);
            if(arr[x][y] == 0){
                arr[x][y] = c;
            }else{
                if(arr[x][y] > c){
                    arr[x][y] = c;
                }
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(arr[j][i] == 0) continue;;

                for(int k = 1; k <= n; k++){
                    if(arr[i][k] == 0 || j == k) continue;;

                    if(arr[j][k] == 0 || arr[j][k] > arr[j][i] + arr[i][k]){
                        arr[j][k] = arr[j][i] + arr[i][k];
                    }
                }
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(arr[i][j]);
                if(j != n){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

