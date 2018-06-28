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

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[n+2][m+2];
        LinkedList<Integer> x = new LinkedList<>();//1인 x좌표를 저장
        LinkedList<Integer> y = new LinkedList<>();//1안 y좌표를 저장
        int day = 0;
        long check = 0;
        long one = 0;

        for(int i = 0; i <= n+1; i++){
            for(int j = 0; j <= m+1; j++){
                if(i == 0 || j == 0 || i == n+1 || j == m+1){
                    arr[i][j] = -1;
                }else{
                    arr[i][j] = sc.nextInt();
                    //토마토가 있다면 x,y의 좌표를 저장한다
                    if(arr[i][j] == 1){
                        x.add(i);
                        y.add(j);
                        one++;
                    }else if(arr[i][j] == 0){
                        check++;
                    }
                }
            }
        }
        boolean stop_check = false;
        while(true){
            long temp = 0;
            //토마토가 다 자라있는 경우
            if(check == 0){
                break;
            }

            while(one != 0){
                one--;
                int i = x.pollFirst();
                int j = y.pollFirst();
                //토마토가 있는 상자의 좌표 상하좌우를 비교해 0인 경우 그 좌표를 다시 list에 저장하고 1로 만들어준다
                for(int k = 0; k < 4; k++){
                    if(arr[i + ch_x[k]][j + ch_y[k]] == 0){
                        arr[i + ch_x[k]][j + ch_y[k]] = 1;
                        x.add(i + ch_x[k]);
                        y.add(j + ch_y[k]);
                        temp++;
                        check--;
                    }
                }
            }
            //토마토가 자라지 않은게 있지만 인접한 토마토중 자라지 않은 토마토가 없는 경우 -1
            if(temp == 0 && check != 0){
                day = -1;
                break;
            }
            one = temp;
            day++;
        }
        System.out.println(day);
    }
}

