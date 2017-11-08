/**
 * Created by heebin on 2017. 10. 6..
 */
import java.util.*;
public class Main_10798 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char[][] list = new char[5][15];
        int[] check = new int[5];
        String src = "";

        for(int i = 0; i < 5; i++){
            src = sc.nextLine();
            check[i] = src.length();
            for(int j = 0; j < src.length(); j++){
                list[i][j] = src.charAt(j);
            }
        }

        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(check[j] > i){
                    System.out.print(list[j][i]);
                }
            }
        }
    }
}
