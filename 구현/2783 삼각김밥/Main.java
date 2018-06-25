import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        double gram = sc.nextDouble();

        double min = 1000 * (price / gram);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            price = sc.nextDouble();
            gram = sc.nextDouble();

            double temp = 1000 * (price / gram);

            if(temp < min){
                min = temp;
            }
        }
        System.out.printf("%.2f",min);
    }
}


