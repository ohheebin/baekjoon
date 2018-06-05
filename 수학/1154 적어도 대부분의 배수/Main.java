import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; 

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int j = 0;
        while(count < 3){
            count = 0;
            j++;
            for(int i = 0; i < 5; i++){
                if(j % arr[i] == 0){
                    count++;
                }
            }
        }
        System.out.println(j);
    }
}


