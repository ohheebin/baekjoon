import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(bw.readLine());

        for(int i = 0; i < n; i++){
            int m = Integer.valueOf(bw.readLine());
            String[] pass_1 = bw.readLine().split(" ");
            String[] pass_2 = bw.readLine().split(" ");
            String[] str = bw.readLine().split(" ");
            int[] num = new int[m];

            for(int j = 0; j < m; j++){
                for(int k = 0; k < m; k++){
                    if(pass_1[j].equals(pass_2[k])){
                        System.out.print(str[k]);
                    }
                }
                if(j != m-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

