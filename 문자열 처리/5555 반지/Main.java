import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String check = bw.readLine();
        int n = Integer.valueOf(bw.readLine());
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = bw.readLine();
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < str[i].length(); j++){
                String temp = "";
                int num = 0;
                // 체크하는 문자의 수만큼 합쳐가면서 같은지 비교한다 만약 문자열의 길이가 넘어가면 0부터 다시 조사한다
                for(int k = 0; k < check.length(); k++){
                    if(j+k >= str[i].length()){
                        temp += str[i].charAt(num);
                        num++;
                    }else {
                        temp += str[i].charAt(j + k);
                    }
                }
                if(temp.equals(check)){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

