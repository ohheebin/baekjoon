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
        String[] st = bw.readLine().split(" ");
        n = Integer.valueOf(st[0]);
        m = Integer.valueOf(st[1]);
        arr = new int[n][m];
        list = new int[n][m];
        for(int i = 0; i < n; i++){
            String[] str = bw.readLine().split(" ");
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.valueOf(str[j]);
                list[i][j] = -1;
            }
        }

        System.out.println(find(0,0));
    }

    public static int find(int x, int y){
        if(x == n-1 && y == m-1){
            return 1;
        }

        if(list[x][y] != -1){
            return list[x][y];
        }
        list[x][y] = 0;
        for(int i = 0; i < 4; i++){
            int a = x + ch_x[i];
            int b = y + ch_y[i];
            if(a >= 0 && a < n && b >= 0 && b < m){
                if(arr[x][y] > arr[a][b]){
                    list[x][y] += find(a,b);
                }
            }
        }
        return list[x][y];
    }
}

