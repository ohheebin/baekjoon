import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);

        int[][] arr_w = new int[10][2];
        int[][] arr_k = new int[10][2];

        int ch_w = 0;
        int ch_k = 0;
        int sum_w = 0;
        int sum_k = 0;

        for(int i = 0; i < 10; i++){
            arr_w[i][0] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            arr_k[i][0] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            int max_w = 0;
            int max_k = 0;
            for(int j = 0; j < 10; j++){
                if(max_k < arr_k[j][0] && arr_k[j][1] == 0){
                    max_k = arr_k[j][0];
                    ch_k = j;
                }

                if(max_w < arr_w[j][0] && arr_w[j][1] == 0){
                    max_w = arr_w[j][0];
                    ch_w = j;
                }
            }
            arr_k[ch_k][1] = 1;
            arr_w[ch_w][1] = 1;
            sum_k += arr_k[ch_k][0];
            sum_w += arr_w[ch_w][0];
        }
        System.out.println(sum_w+" "+sum_k);

    }
}


