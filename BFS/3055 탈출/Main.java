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
        sc.nextLine();
        Character[][] land = new Character[n][m]; //땅
        LinkedList<Integer> water_x = new LinkedList<>(); //물이 찬 x좌표
        LinkedList<Integer> water_y = new LinkedList<>(); //물이 찬 y좌표
        LinkedList<Integer> S_x = new LinkedList<>(); //고슴도치의 x좌표
        LinkedList<Integer> S_y = new LinkedList<>(); //고슴도치의 y좌표
        int water = 0; // 물이 1초마다 몇칸 차는지 확인하기 위해
        int S = 1; // 고슴도치가 1초마다 몇칸을 가지는 확인하기 위해

        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            for(int j = 0; j< m; j++){
                land[i][j] = str.charAt(j);
                if(land[i][j] == '*'){
                    water_x.add(i);
                    water_y.add(j);
                    water++;
                }else if(land[i][j] == 'S'){
                    S_x.add(i);
                    S_y.add(j);
                }
            }
        }

        int time = 0;
        boolean stop = false;
        int point = '.';
        int s_int = 'S';
        int D = 'D';

        while(!S_x.isEmpty()){
            if(stop == true){
                break;
            }
            int temp = 0;
            //처음에는 고슴도치의 이동 경로를 확인하고 두번쨰로 물의 이동경로를 확인한다
            // 고슴도치의 이동경로를 확인할때 물이 차있지 않은 경우만 인접경로로 이동하게 한다
            while(S != 0){
                int x = S_x.pollFirst();
                int y = S_y.pollFirst();
                S--;
                if((int)land[x][y] == s_int) {
                    for (int i = 0; i < 4; i++) {
                        int l = x + check[i][0];
                        int k = y + check[i][1];
                        if (l >= 0 && l < n && k >= 0 && k < m) {
                            if ((int)land[l][k] == point) {
                                land[l][k] = 'S';
                                S_x.add(l);
                                S_y.add(k);
                                temp++;
                            } else if ((int)land[l][k] == D) {
                                stop = true;
                            }
                        }
                    }
                    if (stop == true) {
                        break;
                    }
                }
            }
            S = temp;
            temp = 0;
            while(water != 0){
                int x = water_x.pollFirst();
                int y = water_y.pollFirst();
                water--;
                for(int i = 0; i < 4; i++){
                    if(x+check[i][0] >= 0 && x+check[i][0] < n && y+check[i][1] >= 0 && y+check[i][1] < m){
                        if((int)land[x+check[i][0]][y+check[i][1]] == point || (int)land[x+check[i][0]][y+check[i][1]] == s_int){
                            land[x+check[i][0]][y+check[i][1]] = '*';
                            water_x.add(x+check[i][0]);
                            water_y.add(y+check[i][1]);
                            temp++;
                        }
                    }
                }
            }
            water = temp;
            time++;
        }
        if(stop == true){
            System.out.println(time);
        }else{
            System.out.println("KAKTUS");
        }

    }
}

