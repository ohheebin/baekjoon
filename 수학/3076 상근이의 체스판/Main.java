import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean x = true;
        boolean y = true;
        int count = 0;
        int count_x = 0;
        for(int i = 0; i < r*a; i++){
            if(count == a){
                y = false;
            }else if(count == 0){
                y = true;
            }
            for(int j = 0; j < c*b; j++){
                if(count_x == b){
                    x = false;
                }else if(count_x == 0){
                    x = true;
                }
                if(x == y){
                    System.out.print("X");
                }else{
                    System.out.print(".");
                }
                if(x == false){
                    count_x--;
                }else {
                    count_x++;
                }
            }
            System.out.println();
            x = true;
            count_x = 0;
            if(y == false){
                count--;
            }else {
                count++;
            }
        }
    }
}


