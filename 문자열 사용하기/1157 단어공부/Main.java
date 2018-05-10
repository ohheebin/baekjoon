import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int max = 0;
        int[] list = new int[26];
        char ch = '?';
        int check = 0;

        for(int i = 0; i < str.length(); i++){
            int alpa = (int)str.charAt(i);
            if(alpa >= 97){
                list[alpa - 97]++;
            }else{
                list[alpa - 65]++;
            }
        }

        for(int i = 0; i < 26; i++){
            if(max < list[i]){
                max = list[i];
                ch = (char)(i + 65);
                check = i;
            }
        }

        for(int i = 0; i < 26; i++){
            if(check != i && max == list[i]){
                ch = '?';
                break;
            }
        }
        System.out.println(ch);
    }
}
