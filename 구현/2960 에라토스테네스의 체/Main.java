import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] check = new boolean[n+1];
        //1은 소수이다.
        check[1] = true;
        int count = 0;
        int result = 0;
        //2부터 최대값까지의 값들중 소수인 수의 배수들의 값들은 소수가 아니기에 true로 바꿔서 제외시킨다.
        for(int i = 2; i <= n; i++) {
            if(count == m){
                break;
            }
            if(check[i] == false) {
                check[i] = true;
                count++;
                result = i;
            }
            for (int j = 2; i * j <= n; j++) {
                if(count == m){
                    break;
                }
                if(check[i*j] == false){
                    check[i * j] = true;
                    count++;
                    result = i * j;
                }
            }
        }
        System.out.println(result);
    }
}


