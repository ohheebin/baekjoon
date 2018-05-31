import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] arr = new int[t];
        boolean[] dp = new boolean[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        // 입력 받은 수는 좌측에 자신보다 큰 수가 몇개 있는지를 나타낸다
        int count = 0;
        while(count < t) {
            for (int i = 0; i < t; i++) {
                if (arr[i] == 0 && dp[i] == false) {
                    count++;
                    dp[i] = true;
                    //자신보다 큰 수를 나타내기에 좌측의 수들만 -1을 해주면 된다
                    for(int j = 0; j < i; j++){
                        if(arr[j] != 0){
                            arr[j]--;
                        }
                    }
                    if(count != t){
                        System.out.print(i+1+" ");
                    }else{
                        System.out.print(i+1);
                    }
                    break;
                }
            }
        }
    }
}


