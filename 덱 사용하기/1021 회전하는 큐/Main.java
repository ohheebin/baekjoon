import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static Deque<Integer> De = new LinkedList<>();
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int i = 1; i <= n; i++) {
            De.addLast(i);
        }

        int m = sc.nextInt();
        int count = 0;
        int check = 0;

        for(int i = 0; i < m; i++){
            int num = sc.nextInt();
            //오른쪽으로 이동
            int temp = 0;
            int size = De.size();
            while(!De.getFirst().equals(num)){
                De.addFirst(De.pollLast());
                temp++;
            }
            if(temp > size / 2){
                while(temp != 0){
                    De.addLast(De.pollFirst());
                    temp--;
                }
                while(!De.getFirst().equals(num)){
                    De.addLast(De.pollFirst());
                    temp++;
                }
            }
            if(De.getFirst().equals(num)){
                De.pollFirst();
                count += temp;
            }

        }
        System.out.println(count);
    }

}
