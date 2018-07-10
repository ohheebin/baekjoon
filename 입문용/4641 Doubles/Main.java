import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int[] x = {-1,0,1};
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while(true){
            String[] str = bw.readLine().split(" ");
            if(str[0].equals("-1")){
                break;
            }
            int count = 0;
            for(int i = 0; i < str.length-1; i++){
                int k = Integer.valueOf(str[i]);
                for(int j = 0; j < str.length-1; j++){
                    if(i != j){
                        if(k == 2 * Integer.valueOf(str[j])){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}







