/**
 * Created by heebin on 2018. 5. 9..
 */
import java.util.Scanner;
public class Main_11721 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int j = 0;

        for(int i = 0; i < input.length(); i++){
            if(j == 10){
                System.out.println();
                j = 0;
            }
            System.out.print(input.charAt(i));
            j++;
        }
    }
}
