import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Character[] ch = {'a', 'e', 'i', 'o', 'u'};

        while(true) {
            String str = bw.readLine();
            if(str.equals("end")){
                break;
            }

            int vowel = 0; //모음
            int con = 0; //자음
            boolean vowel_check = false;
            Character temp = ' ';
            boolean check = true;
            for (int i = 0; i < str.length(); i++) {
                boolean vowel_con = false;
                // 자음이 들어있는지 체크
                for (int j = 0; j < 5; j++) {
                    if (str.charAt(i) == ch[j]) {
                        vowel_check = true;
                        vowel_con = true;
                        vowel++;
                        con = 0;
                        break;
                    }
                }
                //모음과 자음이 연달아 3번 나오는지 check
                if (vowel_con == true) {
                    if (vowel == 3) {
                        check = false;
                        break;
                    }
                } else {
                    con++;
                    vowel = 0;
                    if (con == 3) {
                        check = false;
                        break;
                    }
                }

                //연속으로 나오는지 check
                if (temp == str.charAt(i)) {
                    if (str.charAt(i) == 'e') { //e나 o가 연속으로 나오는것은 허용
                        check = true;
                    }else if(str.charAt(i) == 'o'){
                        check = true;
                    }else{
                        check = false;
                        break;
                    }
                }
                temp = str.charAt(i);


            }

            if (vowel_check == false || check == false) {
                System.out.println("<" + str + "> is not acceptable.");
            } else if (vowel_check == true && check == true) {
                System.out.println("<" + str + "> is acceptable.");
            }
        }
    }
}







