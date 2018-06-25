import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(bw.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        int[] arr = new int[n+1];

        for(int i = 1; i <= n; i++){
            int k = Integer.valueOf(bw.readLine());
            list.add(k);
            arr[k] = i;
        }
        int count = 0;
        for(int i = n; i >= 2; i--){
            //마지막 번호의 책부터 확인해 나가는데 그 책보다 작은 번호의 책이 더 아래에 있다면 그 책을 빼서 위로 올린다.
            if(arr[i] < arr[i-1]){
                count++;
                arr[i-1] = 0;
            }
        }
        System.out.println(count);
    }
}

