import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int[] list = new int[26];

        for(int i = 0; i < 26; i++){
            list[i] = -1;
        }

        for(int i = 0; i < str.length(); i++){
            int num = (int)str.charAt(i) - 97;

            if(list[num] == -1){
                list[num] = i;
            }
        }

        for(int i = 0; i < 26; i++){
            System.out.print(list[i]);
            if(i != 25){
                System.out.print(" ");
            }
        }
    }
}
