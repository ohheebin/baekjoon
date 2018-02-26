import java.util.Scanner;

public class Main_1159 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] list = new int[26];

        char ch = 97;
        boolean check = false;
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int k = name.charAt(0);
            list[k - 97]++;
        }

        for(int i = 0; i < 26; i++){
            ch = 97;
            if(list[i] >= 5){
                ch += i;
                System.out.print(ch);
                check = true;
            }
        }

        if(check == false){
            System.out.print("PREDAJA");
        }
    }
}
