import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String[] str = bw.readLine().split(" ");
        int n = Integer.valueOf(str[0]);
        int m = Integer.valueOf(str[1]);

        int k = Integer.valueOf(bw.readLine());

        String[] list = new String[n+1];

        for(int i = 1; i <= n; i++){
            list[i] = bw.readLine();
        }
        int[][] jungle = new int[n+1][m+1];
        int[][] ocean = new int[n+1][m+1];
        int[][] ice = new int[n+1][m+1];

        //미리 각 칸까지의 정글 바다 빙하의 수를 확인한다
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                jungle[i][j] = jungle[i][j-1];
                ocean[i][j] = ocean[i][j-1];
                ice[i][j] = ice[i][j-1];
                if((int)list[i].charAt(j-1) == (int)'J'){
                    jungle[i][j]++;
                }else if((int)list[i].charAt(j-1) == (int)'O'){
                    ocean[i][j]++;
                }else{
                    ice[i][j]++;
                }
            }
        }

        //각 라인의 정글 바다 빙하의 수를 빼서 더해준다
        for(int i = 0; i < k; i++){
            String[] ch = bw.readLine().split(" ");
            int a = Integer.valueOf(ch[0]);
            int b = Integer.valueOf(ch[1]);
            int c = Integer.valueOf(ch[2]);
            int d = Integer.valueOf(ch[3]);
            int[] check = new int[3];
            for(int j = a; j <= c; j++){
                check[0] += (jungle[j][d] - jungle[j][b-1]);
                check[1] += (ocean[j][d] - ocean[j][b-1]);
                check[2] += (ice[j][d] - ice[j][b-1]);
            }
            for(int j = 0; j < 3; j++){
                if(j != 2){
                    System.out.print(check[j]+" ");
                }else{
                    System.out.println(check[j]);
                }
            }
        }
    }
}

