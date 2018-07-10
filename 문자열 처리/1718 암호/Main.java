import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String str = bw.readLine();
        String check = bw.readLine();
        int num = 0;
        for(int i = 0; i < str.length(); i++){
            int k = str.charAt(i) - 96;
            if(k >= 1 && k <= 26){
                int a = check.charAt(num) - 96;
                char result = ' ';
                if(k <= a) { // a를 넘어가게 되면 z로 이동하게 하기에 122을 더해준다
                    result = (char) (k - a + 122);
                }else { //a를 넘어가지 않는 경우
                    result = (char) (k - a + 96);
                }
                System.out.print(result);
            }else{
                System.out.print(" ");
            }
            num++;
            if(num == check.length()){
                num = 0;
            }
        }
    }
}

