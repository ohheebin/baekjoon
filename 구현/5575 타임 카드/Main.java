import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][6];
        int[][] result = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 6; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 2; j >= 0; j--){
                if(arr[i][j] > arr[i][j+3]){
                    arr[i][j+3] += 60;
                    arr[i][j+2]--;
                }
                result[i][j] = arr[i][j+3] - arr[i][j];
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(result[i][j]);
                if(j != 2){
                    System.out.print(" ");
                }else{
                    System.out.println();
                }
            }
        }
    }
}


