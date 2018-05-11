/**
 * Created by heebin on 2018. 5. 11..
 */
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean[] check = new boolean[10001];
        check[1] = true;
        boolean bool = false;
        int sum = 0;
        int min = 0;


        for(int i = 2; i <= 10000; i++){
            for(int j = 2; i * j <= 10000; j++){
                check[i * j] = true;
            }
        }

        for(int i = x; i <= y; i++){
            if(check[i] == false){
                if(bool == false){
                    min = i;
                    sum += min;
                    bool = true;
                }else{
                    sum += i;
                }
            }
        }
        if(bool == false){
            System.out.println("-1");
        }else {
            System.out.print(sum + "\n" + min);
        }
    }
}
