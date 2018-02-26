import java.util.Scanner;

public class Main_2822 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] list = new int[8];
        int[] num = new int[8];
        int max = 0;
        int one = 0;
        int sum = 0;

        for(int i = 0; i < 8; i++){
            list[i] = sc.nextInt();
        }

        for(int i = 1; i <= 5; i++){
            max = 0;
            for(int j = 0; j < 8; j++){
                if(list[j] > max && num[j] == 0){
                    max = list[j];
                    one = j;
                }
            }
            num[one] = 1;
            sum = sum + max;
        }

        System.out.println(sum);
        for(int i = 0; i < 8; i++){
            if(num[i] == 1){
                System.out.print(i+1 + " ");
            }
        }
    }
}
