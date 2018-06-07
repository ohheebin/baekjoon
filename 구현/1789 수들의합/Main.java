import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        long S = sc.nextLong();

        long sum = 0;
        long n = 0;
        //수들의 합 중 최대값을 구하는 것이기에 1부터 더해주면서 S의 값이 넘어가면
        //그 차이만큼의 수 하나만 제거해주면 된다
        for(long i = 1; i <= S; i++){
            sum += i;
            n++;
            if(sum > S){
                long k = sum - S;
                if(k < i){
                    sum -= k;
                    n--;
                }
            }
            if(sum == S){
                break;
            }

        }
        System.out.println(n);
    }
}


