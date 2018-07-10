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
        for(int i = 0; i < n; i++){
            str[i] = bw.readLine();
        }
        if(n != 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) { // 펜릴드롭이 나오면 그것이 정답일 수 있다 aba 와 같은 경우는 그 자체하나로 비밀번호 확인 가능 그렇기에 자기자신도 확인 한다
                    if (str[i].length() == str[j].length()) {
                        for (int k = 0; k < str[i].length(); k++) {
                            if (str[i].charAt(k) != str[j].charAt(str[j].length() - 1 - k)) {
                                break;
                            }
                            if (k == str[i].length() - 1) {
                                System.out.println(str[i].length() + " " + str[i].charAt(str[i].length() / 2));
                                return;
                            }
                        }
                    }
                }
            }
        }else{ // n 이 1 인경우는 그 하나가 답이다
            System.out.println(str[0].length() + " " + str[0].charAt(str[0].length() / 2));
        }
    }
}

