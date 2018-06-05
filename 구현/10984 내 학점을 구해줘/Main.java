import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int sum_c = 0;
            double sum_g = 0;

            for(int j = 0; j < n; j++){
                int c = sc.nextInt();
                sum_c += c;
                sum_g += sc.nextDouble() * c;
            }
            sum_g = sum_g / sum_c;
            //소수점 둘째자리에서 반올림
            System.out.println(sum_c+" "+ (Math.round(sum_g*10)/10.0));
        }
    }
}


