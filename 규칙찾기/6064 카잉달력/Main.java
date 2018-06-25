import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            long last = m;
            long stop = m;
            long count = x;
            boolean ch = true;

            // 달력의 마지막 해를 구해서 count가 그 이상이면 -1을 출력 시킨다
            while (true) {
                int a = m - n;
                if (last <= 0) {
                    last += n;
                } else if (last > n) {
                    last %= n;
                    if (last == 0) {
                        last = n;
                    }
                }
                if (last == n) {
                    break;
                }
                last += a;
                stop += m;
            }
            //m고 n의 차이만큼 check를 더해나가며 check 값이 n보다 크다면 나눈 나머지값을 check값으로 한다
            if(x <= m && y <= n) {
                int num = m - n;
                int check = x;
                while (true) {
                    if (check <= 0) {
                        check += n;
                    } else if (check > n) {
                        check %= n;
                        if(check == 0){//나머지가 0이면 n
                            check = n;
                        }
                    }
                    if (check == y) {
                        break;
                    }
                    check += num;
                    count += m;

                    if (count > stop) { //count가 마지막해보다 크다면 -1을 출력
                        ch = false;
                        break;
                    }

                }
                if (ch == false) {
                    System.out.println(-1);
                } else {
                    System.out.println(count);
                }
            }else{
                System.out.println(-1);
            }
        }
    }
}

