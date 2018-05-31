import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double h = 0; // 높이
        double w = Math.pow((a*a)/(((b*b)+(c*c))/(c*c)),0.5); // 너비

        h = (b/c) * w;

        System.out.print((int)Math.floor(h) + " " + (int)Math.floor(w));
    }
}


