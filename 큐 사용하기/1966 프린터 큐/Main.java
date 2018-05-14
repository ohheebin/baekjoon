import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            Queue<Integer> Q = new LinkedList<>();
            Queue<Integer> Q_num = new LinkedList<>();
            int num = 0;

            int m = sc.nextInt();
            int k = sc.nextInt();

            for(int j = 0; j < m; j++){
                Q.offer(sc.nextInt());
                Q_num.offer(j);
            }

            int x = -1;
            while(x != k){
                if(Collections.max(Q) == Q.element()){
                    Q.poll();
                    x = Q_num.element();
                    Q_num.poll();
                    num++;
                }else{
                    Q.offer(Q.poll());
                    Q_num.offer(Q_num.poll());
                }
            }
            result[i] = num;
        }

        for(int i = 0; i < n; i++){
            System.out.println(result[i]);
        }
    }
}
