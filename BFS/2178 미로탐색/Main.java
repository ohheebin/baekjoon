import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int[] ch_x = {-1,1,0,0};//상 하 좌 우
    private static int[] ch_y = {0,0,-1,1};
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n+2][m+2];
        LinkedList<Integer> x = new LinkedList<>();//1인 x좌표를 저장
        LinkedList<Integer> y = new LinkedList<>();//1안 y좌표를 저장
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            String str = sc.nextLine();
            for(int j = 1; j <= m; j++){
                arr[i][j] = Integer.valueOf(str.charAt(j-1)) - 48;
            }
        }
        x.add(1);
        y.add(1);
        arr[1][1] = 2;//이미 지나간 자리는 2로 한다
        int min = 1;
        int check = 1;

        boolean stop = false;
        while(true){
            int temp = 0;

            while(check != 0){
                int a = x.pollFirst();
                int b = y.pollFirst();
                //마지막 칸에 도달하면 break
                if(a == n && b == m){
                    stop = true;
                    break;
                }
                check--;
                //상하좌우를 비교해 1이면 list에 x,y를 저장하고 지나간표시로 2로 저장해준다.
                for(int i = 0; i < 4; i++){
                    if(arr[a + ch_x[i]][b + ch_y[i]] == 1){
                        temp++;
                        arr[a + ch_x[i]][b + ch_y[i]] = 2;
                        x.add(a + ch_x[i]);
                        y.add(b + ch_y[i]);
                    }
                }
            }
            if(stop == true){
                break;
            }
            //한칸씩 지나가게 되므로 min을 1증가시켜준다
            check = temp;
            min++;
        }
        System.out.println(min);
    }
}

