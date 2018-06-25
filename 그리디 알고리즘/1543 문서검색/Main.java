import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String str = bw.readLine();
        String find = bw.readLine();
        int count = 0;
        int size = str.length();

        if(str.length() >= find.length()){
            for(int i = 0; i < str.length(); ){
                if(size < find.length()) break; // 남은 문자열의 길이가 찾고자하는 문자열의 길이보다 작으면 break
                int check = i;
                boolean bool = true;//찾고자하는 단어가 있다면 i를 그 단어의 길이만큼 늘리고 아니라면 1만 늘린다
                for(int j = 0; j < find.length(); j++){
                    int x = str.charAt(check);
                    int y = find.charAt(j);
                    if(x != y){
                        i++;
                        size--;
                        bool = false;
                        break;
                    }
                    check++;
                }
                if(bool){
                    i += find.length();
                    size -= find.length();
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

