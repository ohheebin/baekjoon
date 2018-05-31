import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int n = sc.nextInt(); // 사탕의 종류의 수
            int k = sc.nextInt(); // 한명당 최소로 먹어야하는 사탕의 수

            int[] arr = new int[n];

            for(int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
            }

            int x = 0;
            int num = 0;
            while(x < n){
                if(arr[x] < k){
                    x++;
                }else {
                    arr[x] -= k;
                    num++;
                }
            }

            System.out.println(num);
        }
    }
}


