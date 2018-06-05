import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[][] list = new int[10][2];
        int min = 10000;
        int ch = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 9; i >= 0; i--){
            for(int j = i; j >= 0; j--){
                list[i][0] += arr[j];
            }
            list[i][1] = Math.abs(list[i][0] - 100);
            if(min > list[i][1]){
                ch = i;
                min = list[i][1];
            }else if(min == list[i][1]){
                if(list[ch][0] < list[i][0]){
                    ch = i;
                }
            }
        }
        System.out.println(list[ch][0]);
    }
}


