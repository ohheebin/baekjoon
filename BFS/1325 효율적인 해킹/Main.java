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
        String[] str = bw.readLine().split(" ");

        int n = Integer.valueOf(str[0]);
        int k = Integer.valueOf(str[1]);

        int[][] arr = new int[n+1][n+1];
        int[] num = new int[n+1];
        int[] result = new int[n+1];
        LinkedList<Integer> list = new LinkedList<>();
        int a = 1;

        //배열에 각 컴퓨터마다 연관되는 컴퓨터를 순서대로 저장하고 num배열의 수를 1씩 증가시켜 각컴퓨터마다 연관된 컴퓨터의 수를 저장한다.
        for(int i = 0; i < k; i++){
            str = bw.readLine().split(" ");
            int m = Integer.valueOf(str[1]);
            arr[m][num[m]] = Integer.valueOf(str[0]);
            num[m]++;
        }
        int max = 0;

        //dfs
        for(int i = 1; i <= n; i++){
            boolean[] check = new boolean[n+1];
            check[i] = true;
            int sum = 0;
            for(int j = 0; j < num[i]; j++){
                list.add(arr[i][j]);
                check[arr[i][j]] = true;
                sum++;
            }
            while(!list.isEmpty()){
                int x = list.pollFirst();
                for(int j = 0; j < num[x]; j++){
                    if(check[arr[x][j]] == false){
                        list.add(arr[x][j]);
                        check[arr[x][j]] = true;
                        sum++;
                    }
                }
            }
            if(max < sum){
                max = sum;
            }
            result[i] = sum; // 1 ~ n 까지의 바이러스 감염 컴퓨터 수를 저장한다
        }

        for(int i = 1; i <= n; i++){
            if(result[i] == max){
                System.out.print(i+" ");
            }
        }

    }
}

