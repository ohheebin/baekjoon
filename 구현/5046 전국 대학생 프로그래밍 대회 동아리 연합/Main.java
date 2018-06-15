import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 참가자 수
        int B = sc.nextInt(); // 최대 비용
        int H = sc.nextInt(); // 호텔 수
        int W = sc.nextInt(); // 주의 수

        int[] p = new int[H]; // 호텔당 일인 숙박비
        int[][] a = new int[H][W]; // 주마다 묵을 수 있는 인원 수

        long min = 500001;
        for(int i = 0; i < H; i++){
            p[i] = sc.nextInt();
            for(int j = 0; j < W; j++){
                a[i][j] = sc.nextInt();
            }
        }
        boolean check = false;

        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(a[i][j] >= n){
                    long ch = n * p[i];
                    if(ch <= B) {
                        if (ch < min) {
                            min = ch;
                            check = true;
                        }
                    }
                }
            }
        }
        if(check != true){
            System.out.println("stay home");
        }else {
            System.out.print(min);
        }

    }
}


