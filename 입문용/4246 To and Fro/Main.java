import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);


        while(true){
            int n = Integer.valueOf(bw.readLine());
            if(n == 0){
                break;
            }
            String str = bw.readLine();
            int num = 0;
            int check = 0;
            int temp = 0;
            int x = (2 * n) - 1; // 다음 줄
            int y = 1; // 바로 밑
            for(int i = 0; i < str.length(); i++){
                System.out.print(str.charAt(num));
                if(check % 2 == 0){
                    num += x;
                }else{
                    num += y;
                }
                check++;
                if(num >= str.length()){
                    check = 0;
                    x -= 2;
                    y += 2;
                    temp++;
                    num = temp;
                }
            }
            System.out.println();
        }
    }
}







