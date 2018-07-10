import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int[] check = {-1,0,1};
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] bool = new boolean[n+1];
        int[][] arr = new int[n+1][n+1];
        LinkedList<Integer> y_point = new LinkedList<>();

        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        int num = 0;
        bool[1] = true;
        for(int i = 1; i <= n; i++){
            if(arr[1][i] == 1){
                y_point.add(i);
                bool[i] = true;
                num++;
            }
        }

        while (!y_point.isEmpty()){
            int a = y_point.pollFirst();
            for(int i = 1; i <= n; i++){
                if(arr[a][i] == 1 && bool[i] == false){
                    y_point.add(i);
                    bool[i] = true;
                    num++;
                }
            }
        }

        System.out.println(num);
    }
}

