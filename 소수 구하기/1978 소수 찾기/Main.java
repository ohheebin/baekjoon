import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean[] check = new boolean[1001];
        check[1] = true;
        int[] numCheck = new int[num];
        int result = 0;
        for(int x = 0; x < num; x++){
            numCheck[x] = sc.nextInt();
        }
        for(int i = 2; i <= 1000; i++){
            for(int j = 2; i * j <= 1000; j++){
                check[i * j] = true;
            }
        }
        for(int x = 0; x < num; x++){
            if(check[numCheck[x]] == false){
                result++;
            }
        }
        System.out.println(result);
    }
}
