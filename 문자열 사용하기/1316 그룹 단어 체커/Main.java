import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = n;
        sc.nextLine();
        for(int i = 0; i < n; i++){
            boolean[] list = new boolean[26];
            String str = sc.nextLine();
            char ch = str.charAt(0);
            list[(int)str.charAt(0) - 97] = true;
            for(int j = 1; j < str.length(); j++){
                if(ch != str.charAt(j)){
                    ch = str.charAt(j);
                    if(list[ch - 97] == true){
                        result--;
                        break;
                    }else{
                        list[ch - 97] = true;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
