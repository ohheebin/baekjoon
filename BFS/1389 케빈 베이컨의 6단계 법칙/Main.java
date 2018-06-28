import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int[] ch_x = {-1, 1, 0, 0}; // 하 상 좌 우
    private static int[] ch_y = {0, 0, -1, 1};
    private static int n;
    private static int m;
    private static int[][] list;

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][n];
        list = new int[n][n];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x-1][y-1] = 1;
            arr[y-1][x-1] = 1;
        }

        for (int i = 0; i < n; i++) {
            LinkedList<Integer> check = new LinkedList<>();
            boolean[] bool = new boolean[n];
            bool[i] = true;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 0) {
                    check.add(j);
                    bool[j] = true;
                }
            }
            bfs(check, arr, i, bool);
        }

        int min = 100000;
        int result = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += list[i][j];
            }
            if(min > sum){
                min = sum;
                result = i;
            }
        }

        System.out.println(result+1);
    }
    //각각 1 ~ n 까지의 각각 친구들가 몇단계로 이루어져 있는지를 검사한다
    private static void bfs(LinkedList<Integer> a, int[][] arr, int ch, boolean[] bool) {
        int num = 1;
        int check = a.size();
        while (!a.isEmpty()) {
            int temp = 0;
            while(check != 0) {
                int x = a.pollFirst();
                list[ch][x] = num;
                check--;
                for (int i = 0; i < n; i++) {
                    if (arr[x][i] != 0 && bool[i] == false) {
                        a.add(i);
                        bool[i] = true;
                        temp++;
                    }
                }
            }
            num++;
            check = temp;
        }
    }
}

