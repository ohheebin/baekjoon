import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String[] num = bw.readLine().split(" ");
        int n = Integer.valueOf(num[0]);
        int m = Integer.valueOf(num[1]);
        int[][] arr = new int[n][m];
        int[] result = new int[5]; // 0 , 4 , 8 , 12 , 16
        String str = "";
        int k = -1;

        //창문이 끝날떄까지의 각 창문의 count를 세고 그 집에 해당하는 배열에 더해준다
        for(int i = 0; i < 5*n+1; i++){
            str = bw.readLine();
            int count = 0;
            int col = 0;
            if(i % 5 != 0) {
                for (int j = 1; j < str.length(); j++) {
                    if(str.charAt(j) == '#'){
                        arr[k][col] += count;
                        col++;
                        count = 0;
                    }else if(str.charAt(j) == '*') {
                        count++;
                    }
                }
            }else{
                k++;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                result[arr[i][j] / 4]++;
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.print(result[i]+" ");
        }
    }
}

