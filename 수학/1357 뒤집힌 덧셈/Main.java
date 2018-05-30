import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String temp_a = Integer.toString(a);
        String temp_b = Integer.toString(b);
        String temp = "";
        for(int i = temp_a.length()-1; i >= 0; i--){
            temp += temp_a.charAt(i);
        }
        a = Integer.valueOf(temp);
        temp = "";
        for(int i = temp_b.length()-1; i >= 0; i--){
            temp += temp_b.charAt(i);
        }
        b = Integer.valueOf(temp);

        int sum = a+b;
        String temp_sum = Integer.toString(sum);
        temp = "";
        for(int i = temp_sum.length()-1; i >= 0; i--){
            temp += temp_sum.charAt(i);
        }
        System.out.println(Integer.valueOf(temp));
    }
}

