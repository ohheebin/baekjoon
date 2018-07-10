import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(bw.readLine());

        for(int i = 0; i < t; i++){
            int n = Integer.valueOf(bw.readLine());
            String[] str = bw.readLine().split(" ");
            int num = n;
            boolean check = false;
            for(int j = 0; j < n; j++){
                //알파벳이 들어간 문자열을 찾는다
                if(str[j].charAt(0) != '#'){
                    num = j;
                    check = true;
                    break;
                }
            }
            //알파벳이 들어간 문자열의 뒷부분 먼저 출력
            for(int j = num+1; j < n; j++){
                System.out.print(str[j]+" ");
            }
            //알파벳이 들어가있다면 알파벳 문자열을 출력
            if(check == true) {
                System.out.print(str[num] + " ");
            }
            //처음부터 알파벳이 들어가기전까지의 문자열 출력
            for(int j = 0; j < num; j++){
                System.out.print(str[j]+" ");
            }
            System.out.println();
        }
    }
}







