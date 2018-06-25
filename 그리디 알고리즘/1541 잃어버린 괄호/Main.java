import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String str = bw.readLine();
        String st = "";
        long sum = 0;
        boolean check = false;
        int minus = '-';
        int plus = '+';
        //-가 나오면 다음 -가 나올때까지 전부 괄호이므로 전부 빼주고 다음 - 가 나와도 괄호를 통해 빼주기에
        //처음 -가 나오면 계속해서 빼나가면 된다
        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i);
            if(num == minus || num == plus){
                if(check == true){
                    sum -= Integer.valueOf(st);
                }else{
                    sum += Integer.valueOf(st);
                }
                if(num == minus){
                    check = true;
                }
                st = "";
            }else{
                st += str.charAt(i);
            }
        }
        if(check == true){
            sum -= Integer.valueOf(st);
        }else{
            sum += Integer.valueOf(st);
        }
        System.out.println(sum);
    }
}

