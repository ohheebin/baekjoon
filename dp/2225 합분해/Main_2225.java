/**
 * Created by heebin on 2018. 2. 15..
 */

import java.util.Scanner;

public class Main_2225 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] list = new int[k+1][n+1];

        for(int i = 1; i <= k; i++){
            for(int j = 0; j <= n; j++){
                if(i == 1 || j == 0){
                    list[i][j] = 1;
                }else{
                    list[i][j] = (list[i-1][j] + list[i][j-1]) % 1000000000;
                }
            }
        }

        System.out.println(list[k][n]);

    }
}
