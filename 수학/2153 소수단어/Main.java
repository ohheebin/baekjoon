import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            int a = Integer.valueOf(str.charAt(i));
            if(a >= 97){
                sum += a - 96;
            }else{
                sum += a - 38;
            }
        }
        boolean[] arr = new boolean[sum+1]; // 초기값 false 이문제에서 1도 소수

        //2부터 최대값까지의 값들중 소수인 수의 배수들의 값들은 소수가 아니기에 true로 바꿔서 제외시킨다.
        for(int i = 2; i < sum; i++) {
            for (int j = 2; i * j <= sum; j++) {
                arr[i * j] = true;
            }
        }

        if(arr[sum] == true){
            System.out.println("It is not a prime word."); // 소수가 아닌경우
        }else{
            System.out.println("It is a prime word."); // 소수인 경우
        }
    }
}


