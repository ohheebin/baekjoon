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
        long[] arr = new long[26];
        long sum = 0;
        for(int i = 0; i < n; i++){
            str[i] = bw.readLine();
            int size = str[i].length()-1;
            //각각 알파벳의 자릿수를 계속해서 더해줘서 가장 큰 값을 가진 알파벳 순으로 9 ~ 0 까지 숫자를 곱해준다
            for(int j = 0; j < str[i].length(); j++){
                arr[str[i].charAt(j)-65] += Math.pow(10,size);
                size--;
            }
        }
        for(int j = 9; j >= 0; j--) {
            long max = 0;
            int ch = 0;
            for (int i = 0; i < 26; i++) {
                if(max <= arr[i]){
                    max = arr[i];
                    ch = i;
                }
            }
            sum += (max * j);
            arr[ch] = 0;
        }

        System.out.println(sum);
    }
}

