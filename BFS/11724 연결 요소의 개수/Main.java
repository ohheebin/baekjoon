import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int[] ch_x = {1,-1,0,0}; // 하 상 좌 우
    private static int[] ch_y = {0,0,-1,1};

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int[][] list = new int[n+1][n+1];
        boolean[] check = new boolean[n+1];
        LinkedList<Integer> arr = new LinkedList<>();
        int num = 0;
        for(int i = 0; i < t; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            //쌍방향 선이기에 둘다 1로 해준다
            list[x][y] = 1;
            list[y][x] = 1;
        }
        //1부터 true인 경우는 이미 도로가 생성되어 있는 것
        //연결이 안되어있어도 연결요소가 1
        for(int i = 1; i <= n; i++) {
            if (check[i] == false) {
                check[i] = true;
                for (int j = 1; j <= n; j++) {
                    if (list[i][j] == 1 && check[j] != true) {
                        check[j] = true;
                        arr.add(j);
                    }
                }
                while (!arr.isEmpty()) {
                    int k = arr.pollFirst();
                    for (int j = 1; j <= n; j++) {
                        if (list[k][j] == 1 && check[j] != true) {
                            arr.add(j);
                            check[j] = true;
                        }
                    }
                }
                num++;
            }
        }
        System.out.println(num);
    }
}

