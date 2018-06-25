import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String[] str = bw.readLine().split(" ");
        int n = Integer.valueOf(str[0]);
        int m = Integer.valueOf(str[1]);

        String[] DNA = new String[n];
        String result = "";
        for(int i = 0; i < n; i++){
            DNA[i] = bw.readLine();
        }
        long count = 0;
        for(int i = 0; i < m; i++){
            int[] alpa = new int[26]; // 65 ~ => A ~
            int max = 0;
            int num = -1;
            for(int j = 0; j < n; j++){
                alpa[(int)DNA[j].charAt(i) - 65]++;
            }
            //각 문장의 글자 순서마다 많이 나온 문자를 저장
            //최소값은 문장의 수에서 최대값의 수를 빼서 더해나간다
            for(int j = 0; j < 26; j++){
                if(max < alpa[j]){
                    max = alpa[j];
                    num = j;
                }
            }
            char ch = (char)(num+65);
            result += ch;
            count += (n-max);
        }
        System.out.println(result);
        System.out.println(count);
    }
}

