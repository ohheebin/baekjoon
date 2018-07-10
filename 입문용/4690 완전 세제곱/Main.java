import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        for(int i = 2; i <= 100; i++){
            int k = (int)Math.pow(i,3);
            for(int a = 2; a <= i-1; a++){
                int x = (int)Math.pow(a,3);
                for(int b = a+1; b <= i-1; b++){
                    int y = (int)Math.pow(b,3);
                    for(int c = b+1; c <= i-1; c++){
                        int z = (int)Math.pow(c,3);

                        if(k == (x+y+z)){
                            System.out.println("Cube = "+i+", Triple = ("+a+","+b+","+c+")");
                            break;
                        }
                    }
                }
            }
        }
    }
}







