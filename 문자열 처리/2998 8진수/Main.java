import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String[] str = {"000", "001", "010", "011", "100", "101", "110", "111"}; // 8진수 0 ~ 7

        String two = bw.readLine();

        while(two.length() % 3 != 0){ // 8진수를 맞추기위해 3의 배수로 문자열을 앞에 0을 붙여준다
            String temp = "0";
            temp += two;

            two = temp;
        }
        
        int num = 0;
        String check = "";
        String result = "";
        for(int i = 0; i < two.length(); i++){
            check += two.charAt(i);
            num++;
            if(num == 3){
                for(int j = 0; j < 8; j++){
                    if(str[j].equals(check)){
                        result += Integer.toString(j);
                        break;
                    }
                }
                num = 0;
                check = "";
            }
        }
        System.out.println(result);
    }
}

