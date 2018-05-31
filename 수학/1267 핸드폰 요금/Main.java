import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        long num_a = 0; //30초 마다 10원 영식 Y
        long num_b = 0; //50초 마다 15원 민식 M
        for(int i = 0; i < T; i++){
            long check = sc.nextLong();
            long a = check;
            long b = check;

            while(a >= 0){
                a -= 30;
                num_a += 10;
            }

            while(b >= 0){
                b -= 60;
                num_b += 15;
            }
        }

        if(num_a < num_b){
            System.out.println("Y "+num_a);
        }else if(num_a > num_b){
            System.out.println("M "+num_b);
        }else{
            System.out.println("Y M "+num_a);
        }
    }
}


