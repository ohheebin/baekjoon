import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int num = str.length();
        int result = num;
        for(int i = 0; i < num; i++){
            if(str.charAt(i) == '=' || str.charAt(i) == '-'){
                if(str.charAt(i-1) == 'z'){
                    if(str.charAt(i-2) == 'd'){
                        result--;
                    }
                }
                result--;
            }
            else if(str.charAt(i) == 'j' && i > 0){
                if(str.charAt(i - 1) == 'l' || str.charAt(i - 1) == 'n'){
                    result--;
                }
            }
        }

        System.out.println(result);
    }
}
