import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();
        LinkedList<Long> list = new LinkedList<>();

        for(int i = 0; i < n; i++){
            long k = sc.nextLong();
            long j = 2;
            long ch = k;
            while(k <= m){
                list.add(k);
                 k = ch * j;
                 j++;
            }
        }

        Collections.sort(list);
        long temp = 0;
        long count = 0;

        while(!list.isEmpty()){
            if(temp != list.peek()){
                count++;
            }
            temp = list.poll();
        }

        System.out.println(count);

    }
}


