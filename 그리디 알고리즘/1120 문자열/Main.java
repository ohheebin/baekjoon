import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String[] str = bw.readLine().split(" ");
        LinkedList<Character> B = new LinkedList<>();

        int i = str[1].length() - str[0].length(); // 앞에 추가
        int j = 0; // 뒤에 추가
        int min = 51;
        while(true){
            LinkedList<Character> A = new LinkedList<>();
            int count = 0;
            int temp = i; // 앞에 추가한 문자 다음의 문자들부터 비교해 나간다
            for(int x = 0; x < str[0].length(); x++){
                int a = str[1].charAt(temp);
                int b = str[0].charAt(x);
                if(a != b){
                    count++;
                }
                temp++;
            }
            if(min > count){
                min = count;
            }
            if(j == str[1].length() - str[0].length()){
                break;
            }
            i--;
            j++;
        }
        System.out.print(min);
    }
}

