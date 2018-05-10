import java.util.*;
import java.io.*;
public class Main_1546 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double max = 0;
        double[] list = new double[n];
        double sum = 0;

        for(int i = 0; i < n; i++){
            list[i] = sc.nextInt();
            if(max < list[i]){
                max = list[i];
            }
        }

        for(int i = 0; i < n; i++){
            double num = Math.round(((list[i]/max) * 100)*100) / 100.0;
            sum += num;
        }

        System.out.printf("%.2f", sum / n);

    }
}