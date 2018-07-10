import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int[] check = {-1,0,1};
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int x = 0;

        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            if(x != 0){
                System.out.println();
            }
            int[] arr = new int[n+1];
            int[] check = new int[6];
            for(int i = 1; i <= n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < 6; i++){
                check[i] = i+1;
            }
            int num = 5;

            while(true){
                for(int i = 0; i < 6; i++){
                    System.out.print(arr[check[i]]);
                    if(i != 5){
                        System.out.print(" ");
                    }
                }
                System.out.println();
                if(check[0] == n-5){
                    break;
                }
                int ch = 0;
                //번호를 1씩 증가시킨다.
                for(int i = 5; i >= 0; i--){
                    if(check[i] != n-ch){
                        check[i]++;
                        for(int j = i+1; j <= 5; j++){
                            check[j] = check[j-1] + 1;
                        }
                        break;
                    }
                    ch++;
                }
            }
            x++;
        }
    }
}

