import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] list = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
        int sum = str.length();
        for(int i = 0; i < str.length(); i++){
            sum += list[str.charAt(i) - 65];
        }
        System.out.println(sum);
    }
}
