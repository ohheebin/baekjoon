import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        int[] list = new int[10];
        int max = 0;

        for(int i = 0; i < n.length(); i++){
            list[(int)n.charAt(i) - 48]++;
        }

        double six = list[6];
        double nine = list[9];
        int check_num = 0;

        for(int i = 0; i < 10; i++){
            if(max < list[i]){
                max = list[i];
                check_num = i;
            }
        }

        if(check_num == 6 || check_num == 9){
            max = (int)Math.ceil(((six + nine) / 2));
        }

        System.out.println(max);
    }
}
