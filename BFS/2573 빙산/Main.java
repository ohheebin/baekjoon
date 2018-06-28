import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int[][] check = {{-1,0},{1,0},{0,1},{0,-1}}; //상하좌우 체크
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ice = new int[n][m];
        LinkedList<Integer> x_point = new LinkedList<>();
        LinkedList<Integer> y_point = new LinkedList<>();


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ice[i][j] = sc.nextInt();
            }
        }
        int day = 0;
        while(true){
            boolean[][] ch = new boolean[n][m];
            int num = 0;
            //빙산의 덩어리 수를 확인한다
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(ice[i][j] != 0 && ch[i][j] == false){
                        x_point.add(i);
                        y_point.add(j);
                        ch[i][j] = true;
                        while(!x_point.isEmpty()){
                            int a = x_point.pollFirst();
                            int b = y_point.pollFirst();
                            for(int k = 0; k < 4; k++){
                                int x = a + check[k][0];
                                int y = b + check[k][1];
                                if(x >= 0 && x < n && y >= 0 && y < m){
                                    if(ice[x][y] != 0 && ch[x][y] == false){
                                        x_point.add(x);
                                        y_point.add(y);
                                        ch[x][y] = true;
                                    }
                                }
                            }
                        }
                        num++;
                    }
                }
            }
            if(num >= 2){ //2덩어리 이상이면 day 출력
                System.out.println(day);
                break;
            }else if(num == 0){ // 덩어리가 0이라는 것은 빙산이 다녹았다는 뜻 0 출력
                System.out.println(0);
                break;
            }
            //빙산주변의 바다의 수를 체크한다
            int[][] ice_minus = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(ice[i][j] != 0){
                        int ocean = 0;
                        for(int k = 0; k < 4; k++){
                            int x = i + check[k][0];
                            int y = j + check[k][1];
                            if(x >= 0 && x < n && y >= 0 && y < m){
                                if(ice[x][y] == 0){
                                    ocean++;
                                }
                            }
                        }
                        ice_minus[i][j] = ocean;
                    }
                }
            }
            //빙산의 크기를 줄인다
            for(int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ice[i][j] -= ice_minus[i][j];
                    if(ice[i][j] < 0){
                        ice[i][j] = 0;
                    }
                }
            }
            day++;
        }

    }
}

