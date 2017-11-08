//2490 윷놀이
import java.util.*;
public class Main13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[][] list = new int[3][4];
        char[] ans = new char[3];

        for(int i = 0; i < 3; i++){
            int num = 0;
            for(int j = 0; j < 4; j++){
                list[i][j] = sc.nextInt();
                if(list[i][j] == 1){
                    num += 1;
                }
            }
            if(num == 0){
                ans[i] = 'D';
            }else if(num == 1){
                ans[i] = 'C';
            }else if(num == 2){
                ans[i] = 'B';
            }else if(num == 3){
                ans[i] = 'A';
            }else{
                ans[i] = 'E';
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.println(ans[i]);
        }

    }
}
