import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String str = bw.readLine();
        String A = "AAAA";
        String B = "BB";
        int count = 0;
        String result = "";
        int x = 'X';
        int dot = '.';
        for(int i = 0; i < str.length(); i++){
            if(count == 4){
                result += A;
                count = 0;
            }
            if(x == (int)str.charAt(i)) {
                count++;
                if(i == str.length() - 1){
                    if(count == 2){
                        result += B;
                    }else if(count == 1 || count == 3){
                        result = "-1";
                        break;
                    }else{
                        result += A;
                    }
                }
            }else{
                if(count == 2){
                    result += B;
                }else if(count == 1 || count == 3){
                    result = "-1";
                    break;
                }
                count = 0;
                result += '.';
            }
        }
        System.out.println(result);
    }
}

