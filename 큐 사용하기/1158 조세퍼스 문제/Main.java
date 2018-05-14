import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> Q = new LinkedList<>();
        int[] result = new int[n];
        for(int i = 1; i <= n; i++){
            Q.offer(i);
        }
        int check = 1;
        int i = 0;
        while(!Q.isEmpty()){
            if(check == m){
                result[i] = Q.element();
                Q.poll();
                check = 1;
                i++;
            }else if(check < m){
                Q.offer(Q.element());
                Q.poll();
                check++;
            }
        }

        for(int j = 0; j < n; j++){
            if(j == 0){
                System.out.print("<"+result[j]);
            }
            if(j != 0){
                System.out.print(", " + result[j]);
            }
            if(j == n - 1){
                System.out.print(">");
            }
        }
    }
}
