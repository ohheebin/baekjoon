import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();//방학일
        double a = sc.nextDouble();//국어
        double b = sc.nextDouble();//수학
        double c = sc.nextDouble();//하루에 국어 푸는양
        double d = sc.nextDouble();//하루에 수학 푸는양

        double leng = Math.ceil(a / c);
        double math = Math.ceil(b / d);

        if(leng > math){
            System.out.println((int)(l-leng));
        }else{
            System.out.println((int)(l-math));
        }
    }
}


