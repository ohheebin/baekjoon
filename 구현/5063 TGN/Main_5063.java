import java.util.Scanner;

public class Main_5063 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] list = new int[n][3];

        for(int i = 0; i < n; i++){
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
            list[i][2] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(list[i][0] > (list[i][1] - list[i][2])){
                System.out.println("do not advertise");
            }else if(list[i][0] < (list[i][1] - list[i][2])){
                System.out.println("advertise");
            }else{
                System.out.println("does not matter");
            }
        }
    }
}
