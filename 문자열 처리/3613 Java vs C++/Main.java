import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String str = bw.readLine();
        String result = "";
        int under = '_';
        boolean C = false;
        boolean java = false;
        for(int i = 0; i < str.length(); i++){
            int a = str.charAt(i);
            if(C == true && java == true){ // java와 c의 특징을 다 가지면 Error
                result = "Error!";
                break;
            }
            if(i == 0 && a >= 65 && a <= 90){ // 첫자리가 대문자이면 안된다
                result = "Error!";
                break;
            }
            if(i == 0 && a == under){ // 첫자리가 _이면 안된다
                result = "Error!";
                break;
            }
            if(a >= 65 && a <= 90){ // 대문자인 경우 java의 특징이므로 _를 붙이고 소문자로 바꿔준다
                result += '_';
                result += (char) (a+32);
                java = true;
            }else if(a == under){ // _인 경우 C++의 특징이므로 _를 삭제하고 대문자로 바꿔준다
                C = true;
                if(i == str.length()-1){ // _가 마지막이면 Error
                    result = "Error!";
                    break;
                }else {
                    int b = str.charAt(i + 1);
                    if(b >= 97 && b <= 122){
                        result += (char) (b - 32);
                        i++;
                    }else{ // _ 다음 대문자가 아니라면 Error
                        result = "Error!";
                        break;
                    }
                }
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}

