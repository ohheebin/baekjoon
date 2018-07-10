import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int[] x = {-1,0,1};
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        for(int i = 1000; i <= 10000; i++){
            String str = Integer.toString(i);
            int sum = 0;
            //10진수 자릿수의 합
            for(int j = 0; j < str.length(); j++){
                sum += Integer.valueOf(String.valueOf(str.charAt(j)));
            }
            int sum_ch = 0;
            int num = i;
            while(true){ // 12진수의 자릿수 합
                if(num == 0){
                    break;
                }
                sum_ch += num % 12;
                num /= 12;
            }
            if(sum == sum_ch){
                sum_ch = 0;
                num = i;
                while(true){ // 16진수 자릿수의 합
                    if(num == 0){
                        break;
                    }
                    sum_ch += num % 16;
                    num /= 16;
                }
                if(sum == sum_ch){
                    System.out.println(i);
                }
            }
        }
    }
}







