import java.util.Scanner;

public class Main_3034 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int[] list = new int[n];


        for(int i = 0; i < n; i++){
            list[i] = sc.nextInt();
        }

        double k = Math.sqrt((w*w)+(h*h));

        for(int i = 0; i < n; i++){
            if(k >= list[i]){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}
