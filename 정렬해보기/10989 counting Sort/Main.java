import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException{
        //counting sort 문제 count를 체크해서 그 수만큼 수를 출력하는 알고리즘
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        int m = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            m = Integer.parseInt(br.readLine());
            arr[m]++;
            if(max < m){
                max = m;
            }
        }

        for(int i = 0; i <= max; i++){
            if(arr[i] != 0){
                for(int j = 1; j <= arr[i]; j++){
                    wr.write(String.valueOf(i));
                    wr.newLine();
                }
            }
        }
        wr.flush();
        br.close();
        wr.close();
    }
}

