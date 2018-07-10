import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int[] ch_x = {-1,0,1,0};
    private static int[] ch_y = {0,-1,0,1};
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        LinkedList<Integer> x = new LinkedList<>();
        LinkedList<Integer> y = new LinkedList<>();

        int[][] arr = new int[n+1][n+1];
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = -1; // 더 빠른 역사
            arr[b][a] = 1; // 더 느린 역사
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(arr[i][j] == 1){
                    x.add(j);
                }else if(arr[i][j] == -1){
                    y.add(j);
                }
            }
            while(true){
                if(x.isEmpty() && y.isEmpty()){
                    break;
                }
                if(!x.isEmpty()) { // 느른 역사들을 배열에 저장한다
                    int a = x.pollFirst();
                    for(int j = 1; j <= n; j++){
                        if(arr[a][j] == 1 && arr[i][j] != 1){
                            arr[i][j] = 1;
                            x.add(j);
                        }
                    }
                }
                if(!y.isEmpty()){ // 더 빠른 역사를 배열에 저장한다
                    int a = y.pollFirst();
                    for(int j = 1; j <= n; j++){
                        if(arr[a][j] == -1 && arr[i][j] != -1){
                            arr[i][j] = -1;
                            y.add(j);
                        }
                    }
                }
            }
        }
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(arr[a][b]);
        }
    }
}

