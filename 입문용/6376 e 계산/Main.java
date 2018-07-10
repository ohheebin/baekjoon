import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int[] x = {-1,0,1};
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        System.out.println("n e");
        System.out.println("- -----------");
        double[] arr = new double[10];
        arr[0] = 1;
        for(int i = 1; i <= 9; i++){
            double sum = 1;
            for(int j = 1; j <= i; j++){
                sum *= j;
            }
            arr[i] = arr[i-1] + (1/sum);
        }
        for(int i = 0; i <= 9; i++){
            System.out.print(i+" ");
            if(i <= 1){
                System.out.println((int)arr[i]);
            }else if(i > 2){
                System.out.printf("%.9f\n",arr[i]);
            }else{
                System.out.println(arr[i]);
            }
        }
    }
}







