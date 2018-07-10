import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int[] x = {-1,0,1};
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String[] str = bw.readLine().split(" ");
        int n = Integer.valueOf(str[0]);
        int m = Integer.valueOf(str[1]);

        String[] ch = bw.readLine().split(" ");
        String[] ch2 = bw.readLine().split(" ");
        LinkedList<Long> pizza = new LinkedList<>();
        LinkedList<Long> ob = new LinkedList<>();
        long[] min = new long[n]; // 각 깊이 까지의 최소값
        min[0] = Long.valueOf(ch[0]);
        for(int i = 0; i < n; i++){
            ob.add(Long.valueOf(ch[i]));
            //각 깊이의 최소값을 구해준다 그 최소값이 더 크거나 같다면 그자리에 피자를 놓는다
            if(i >= 1){
                if(min[i-1] >= ob.get(i)) {
                    min[i] = ob.get(i);
                }else{
                    min[i] = min[i-1];
                }
            }
        }

        for(int i = 0; i < m; i++){
            pizza.add(Long.valueOf(ch2[i]));
        }

        int check = n-1;
        while(!pizza.isEmpty()){
            long pi = pizza.pollFirst();
            for(int i = check; i >= 0; i--){
                if(pi <= min[i]){
                    if(pizza.isEmpty()){ // 피자를 다 놓았다면 그자리를 출력
                        check = i;
                        break;
                    }
                    check = i-1;
                    break;
                }
                if(i == 0){ // 0까지 갔는데 피자를 놓지 못했다면 0을 출력
                    check = -1;
                }
            }
            if(check == -1){
                break;
            }
        }
        System.out.println(check+1);
    }
}

