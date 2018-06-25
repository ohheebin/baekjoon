import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int six_min = 1001; //6개 패키지 중 가장 싼 브랜드의 가격
        int one_min = 1001; //1개의 가격중 가장 싼 브랜드의 가격
        for(int i = 0; i < m; i++){
            int six = sc.nextInt();
            int one = sc.nextInt();

            if(six < six_min){
                six_min = six;
            }

            if(one < one_min){
                one_min = one;
            }
        }
        long sum = 0;

        while(true){
            if(n <= 0){
                break;
            }
            //6개 패키지가 1개를 6개 사는 것 보다 싼경우
            if(six_min <= one_min*6){
                if(n < 6){//남은 줄의 수가 6개 인경우 1개를 n개 사는것이 싼지 6개 패키지를 사는게 싼지 비교
                    if(six_min <= one_min*n){
                        n-= 6;
                        sum += six_min;
                    }else{
                        sum += one_min * n;
                        n = 0;
                    }
                }else { // 남은 줄이 6개 이상인 경우 6개 패키지를 산다
                    n -= 6;
                    sum += six_min;
                }
            }else if(six_min > one_min*6){//6개 패키지가 1개를 6개 사는 가격보다 비싸면 1개를 n개 구매
                sum += one_min * n;
                n = 0;
            }
        }
        System.out.println(sum);
    }
}

