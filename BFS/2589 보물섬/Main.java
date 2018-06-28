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

        int[][] arr = new int[n][m];
        LinkedList<Integer> x = new LinkedList<>(); //토마토가 익은 x좌표 저장
        LinkedList<Integer> y = new LinkedList<>(); //토마토가 익은 y좌표 저장
        int L = 'L';//육지 1 바다 0
        int max = 0;
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            for(int j = 0; j < m ; j++){
                if((int)str.charAt(j) == L){
                    arr[i][j] = 1; // 육지 1
                }else{
                    arr[i][j] = 0; // 바다 0
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 1){
                    //한칸한칸 가장 멀리 존재하는 육지까지의 시간을 체크해서 가장 긴 시간을 구해낸다
                    boolean[][] check = new boolean[n][m];
                    check[i][j] = true;
                    x.add(i);
                    y.add(j);
                    int hour = -1; // 마지막 위치에 도달후 1시간이 더 증가하기에 -1부터 시작한다
                    int stop = 1;
                    while(!x.isEmpty()){
                        int temp = 0;
                        while(stop != 0) {
                            int a = x.pollFirst();
                            int b = y.pollFirst();
                            stop--;
                            for (int k = 0; k < 4; k++) {
                                if (a + ch_x[k] >= 0 && a + ch_x[k] < n && b + ch_y[k] >= 0 && b + ch_y[k] < m) {
                                    if (arr[a + ch_x[k]][b + ch_y[k]] == 1 && check[a + ch_x[k]][b + ch_y[k]] == false) {
                                        x.add(a + ch_x[k]);
                                        y.add(b + ch_y[k]);
                                        check[a + ch_x[k]][b + ch_y[k]] = true;
                                        temp++;
                                    }
                                }
                            }
                        }

                        hour++;
                        stop = temp;
                    }
                    if(max < hour){
                        max = hour;
                    }
                }
            }
        }
        System.out.println(max);
    }
}

