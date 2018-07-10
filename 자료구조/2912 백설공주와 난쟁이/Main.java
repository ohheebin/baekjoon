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
        int c = Integer.valueOf(str[1]);

        String[] arr = bw.readLine().split(" ");
        int[] list = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            list[i] = Integer.valueOf(arr[i]);
        }

        int m = Integer.valueOf(bw.readLine());

        for(int i = 0; i < m; i++){
            int[] check = new int[c+1];
            boolean stop = false;
            String[] ch = bw.readLine().split(" ");
            int start = Integer.valueOf(ch[0]) - 1;
            int end = Integer.valueOf(ch[1]) - 1;

            for(int j = start; j <= end; j++){
                int num = list[j];
                check[num]++;
                // 모자 색상이 k/2 보다 많으면 이쁜 모자이기에 break;
                if(check[num] > ((end - start + 1) / 2)){
                    System.out.println("yes " + num);
                    stop = true;
                    break;
                }
            }
            if(stop == false){
                System.out.println("no");
            }
        }
    }
}

