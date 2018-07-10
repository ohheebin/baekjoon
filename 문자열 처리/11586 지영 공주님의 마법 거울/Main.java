import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(bw.readLine());
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = bw.readLine();
        }
        int m = Integer.valueOf(bw.readLine());

        if(m == 1){ // 그대로 출력
            for(int i = 0; i < n; i++){
                System.out.println(str[i]);
            }
        }else if(m == 2){ // 좌우 대칭으로 출력
            for(int i = 0; i < n; i++){
                for(int j = n - 1; j >= 0; j--){
                    System.out.print(str[i].charAt(j));
                }
                System.out.println();
            }
        }else{ // 상하 반대로 출력
            for(int i = n - 1; i >= 0; i--){
                System.out.println(str[i]);
            }
        }
    }
}

