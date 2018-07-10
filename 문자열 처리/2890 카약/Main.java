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
        String[] arr = new String[n];
        int[] rank = new int[10];
        int[] result = new int[10];
        for(int i = 0; i < n; i++){
            arr[i] = bw.readLine();
        }

        for(int i = 0; i < n; i++){
            int num = 0;
            int count = 0;
            for(int j = 1; j < m-1; j++){
                if(arr[i].charAt(j) != '.'){
                    num = Integer.valueOf(String.valueOf(arr[i].charAt(j)));
                    j += 2;
                }else{
                    if(num != 0){//카약 앞에 남은 . 을 샌후 저장한다
                        count++;
                    }
                }
            }
            if(num != 0) {
                rank[num] = count;
            }
        }

        int num = 0;
        int count = 1;
        //ranking을 매긴다
        while(true){
            if(num >= 9){
                break;
            }
            int min = 1000;
            for(int i = 1; i <= 9; i++){
                if(min > rank[i]){
                    min = rank[i];
                }
            }
            for(int i = 1; i <= 9; i++){
                if(min == rank[i]){
                    rank[i] = 1000;
                    result[i] = count;
                    num++;
                }
            }
            count++;
        }

        for(int i = 1; i <= 9; i++){
            System.out.println(result[i]);
        }
    }
}







