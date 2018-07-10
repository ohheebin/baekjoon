import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int[] ch_x = {-1,0,1,0};
    private static int[] ch_y = {0,-1,0,1};
    private static LinkedList<Integer> x_point = new LinkedList<>();
    private static LinkedList<Integer> y_point = new LinkedList<>();
    private static int result = 0;
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 0){
                    arr[i][j] = 1; // 1번째 벽을 세운다
                    int x = i;
                    int y = j;
                    while(true){
                        y++;
                        if(y == m){
                            y = 0;
                            x++;
                        }
                        if(arr[x][y] == 0){//1번째 벽을 새운곳 이후부터 확인해서 2번째 벽을 세운다
                            arr[x][y] = 1;
                            int a = x;
                            int b = y;
                            while(true){
                                b++;
                                if(b == m){
                                    b = 0;
                                    a++;
                                }
                                if(arr[a][b] == 0){//2번째 벽을 세운곳 이후부터 확인해서 3번째 벽을 세운다
                                    arr[a][b] = 1;
                                    boolean[][] list = new boolean[n][m];
                                    dfs(arr,list,n,m); // 바이러스를 퍼지게 한다
                                    max(arr,list,n,m); // 바이러스가 퍼진후 안전한 공간을 확인하고 최대값을 계산한다
                                    arr[a][b] = 0; //벽을 세운곳을 다시 허문다
                                }
                                if(a == n-1 && b == m-1){
                                    break;
                                }
                            }
                            arr[x][y] = 0;//벽을 세운곳을 다시 허문다
                        }
                        if(x == n-1 && y == m-2){
                            break;
                        }
                    }

                    arr[i][j] = 0;//벽을 세운곳을 다시 허문다
                }
                if(i == n-1 && j == m-3){
                    break;
                }
            }
        }
        System.out.println(result);
    }

    private static void dfs(int[][] arr, boolean[][] list, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 2){
                    x_point.add(i);
                    y_point.add(j);
                    list[i][j] = true;
                    while(!x_point.isEmpty()){
                        int x = x_point.pollFirst();
                        int y = y_point.pollFirst();
                        for(int k = 0; k < 4; k++){
                            int a = x + ch_x[k];
                            int b = y + ch_y[k];
                            if(a >= 0 && a < n && b >= 0 && b < m){
                                if(arr[a][b] == 0 && list[a][b] == false){
                                    list[a][b] = true;
                                    x_point.add(a);
                                    y_point.add(b);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void max(int[][] arr, boolean[][] list, int n, int m){
        int num = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 0 && list[i][j] == false){
                    num++;
                }
            }
        }
        if(result < num){
            result = num;
        }
    }
}

