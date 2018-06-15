import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = n * 2 - 1; // 9줄
        int k = 1;
        int l = n - 1;
        boolean k_check = true;
        boolean l_check = true;

        for(int i = 0; i < sum; i++){
            for(int j = 0; j < l; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < k; j++){
                System.out.print("*");
            }
            if(k_check == true) {
                k += 2;
                if(k == sum){
                    k_check = false;
                }
            }else{
                k -= 2;
            }

            if(l_check == true){
                l -= 1;
                if(l == 0){
                    l_check = false;
                }
            }else{
                l += 1;
            }
            System.out.println();
        }
    }
}


