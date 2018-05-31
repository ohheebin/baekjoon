import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //a/c + b/d
        double[][] arr = new double[2][2];
        arr[0][0] = sc.nextInt(); //a
        arr[0][1] = sc.nextInt(); //b
        arr[1][0] = sc.nextInt(); //c
        arr[1][1] = sc.nextInt(); //d
        double max = 0;
        int result = 0;
        for(int i = 0; i < 4; i++){
            double check = arr[0][0] / arr[1][0] + arr[0][1] / arr[1][1];
            if(max < check){
                max = check;
                result = i;
            }
            double temp = arr[0][1];
            arr[0][1] = arr[0][0];
            arr[0][0] = arr[1][0];
            arr[1][0] = arr[1][1];
            arr[1][1] = temp;

        }
        System.out.println(result);
    }
}


