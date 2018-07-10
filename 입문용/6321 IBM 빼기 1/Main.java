import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int[] x = {-1,0,1};
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(bw.readLine());
        String[] result = new String[n];
        for(int i = 0; i < n; i++){
            String str = bw.readLine();
            result[i] = "";
            for(int j = 0; j < str.length(); j++){
                int k = str.charAt(j)+1;
                if(str.charAt(j) == 'Z'){
                    result[i] += 'A';
                }else{
                    result[i] += (char)k;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println("String #"+(i+1));
            System.out.println(result[i]);
            if(i != n-1){
                System.out.println();
            }
        }
    }
}







