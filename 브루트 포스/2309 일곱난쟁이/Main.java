import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
        }
        int[] list = new int[7];
        boolean check = true;
        for(int i = 0; i < 8; i++){
            if(check == false){
                break;
            }
            for(int j = i+1; j < 9; j++){
                int sum = 0;
                list = new int[7];
                int n = 0;
                for(int k = 0; k < 9; k++){
                    if(k != i && k != j){
                        sum += arr[k];
                        list[n] = arr[k];
                        n++;
                    }
                    if(sum > 100){
                        break;
                    }
                }
                if(sum == 100){
                    check = false;
                    break;
                }
            }
        }



        for(int i = 0; i < 6; i++){
            for(int j = i+1; j < 7; j++){
                if(list[i] > list[j]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        for(int i = 0; i < 7; i++){
            System.out.println(list[i]);
        }

    }
}
