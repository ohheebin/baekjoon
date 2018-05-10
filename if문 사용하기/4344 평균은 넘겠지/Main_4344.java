import java.io.IOException;
import java.util.Scanner;

/**
 * Created by heebin on 2018. 5. 10..
 */
public class Main_4344 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        double[] n = new double[c];
        double[] count = new double[c];

        for(int i = 0; i < c; i++){
            double sum = 0;
            double ans = 0;
            n[i] = sc.nextInt();
            double[] list = new double[(int)n[i]];

            for(int j = 0; j < n[i]; j++){
                list[j] = sc.nextInt();
                sum += list[j];
            }

            ans = sum / n[i];

            for(int j = 0; j < n[i]; j++){
                if(ans < list[j]){
                    count[i]++;
                }
            }
        }

        for(int i = 0; i < c; i++){
            double result = Math.round(((count[i] / n[i]) * 100) * 1000) / 1000.0;
            System.out.printf("%.3f",result);
            System.out.print("%\n");
        }

    }
}
