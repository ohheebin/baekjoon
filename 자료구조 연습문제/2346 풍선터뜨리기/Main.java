import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<Integer> arr = new LinkedList<>();
        LinkedList<Integer> dp = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            arr.add(sc.nextInt());
            dp.add(i);
        }
        int k = 0;

        while(true){
            System.out.print(dp.poll()+" ");
            if(dp.isEmpty()){
                break;
            }
            k = arr.poll();
            int count = 0;
            if(k > 0){ //오른쪽으로 이동
                while(count != k - 1){
                    dp.add(dp.poll());
                    arr.add(arr.poll());
                    count++;
                }
            }else{ //왼쪽으로 이동
                while(count != k){
                    dp.addFirst(dp.pollLast());
                    arr.addFirst(arr.pollLast());
                    count--;
                }
            }
        }
    }
}


