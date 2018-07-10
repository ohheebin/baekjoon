import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        int max = 0;
        while(sc.hasNextLine()){ // 입력이 없을 때까지 반복한다
            String str = sc.nextLine();

            for(int i = 0; i < str.length(); i++){
                int num = str.charAt(i);
                if(num >= 97 && num <= 122){
                    arr[num - 97]++;
                    if(max < arr[num-97]){
                        max = arr[num-97];
                    }
                }
            }
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] == max){
                char ch = (char) (i + 97);
                System.out.print(ch);
            }
        }
    }
}

