import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 친구 수
        int m = sc.nextInt(); // 게임 수
        int[] arr = new int[m]; //술래가 된 친구의 번호
        int[] num = new int[n+1]; // 제출한 술래 번호
        int[] count = new int[n+1]; //점수 합계
        for(int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            int check = 0;
            for(int j = 1; j <= n; j++){
                num[j] = sc.nextInt();
            }

            for(int j = 1; j <= n; j++){
                if(num[j] == arr[i]){
                    count[j]++;
                }else{
                    check++;
                }
            }
            count[arr[i]] += check;
        }

        for(int i = 1; i <= n; i++){
            System.out.println(count[i]);
        }

    }
}


