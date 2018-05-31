import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();
        int[] arr = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // 두개의 값을 합쳐서 m이 될경우 갑옷 생성
        for(int i = 0; i < n-1; i++){
            if (arr[i] != 0) {
                for (int j = i+1; j < n; j++) {
                    if (arr[j] != 0) {
                        if (arr[i] + arr[j] == m) {
                            arr[i] = 0;
                            arr[j] = 0;
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}


