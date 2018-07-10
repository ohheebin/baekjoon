import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int[] ch_x = {-1,0,1,0};
    private static int[] ch_y = {0,-1,0,1};
    private static int n, m;
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < T; i++){
            m = sc.nextInt();
            n = sc.nextInt();
            sc.nextLine();
            Character[][] arr = new Character[n][m];
            LinkedList<Integer> x_point = new LinkedList<>();
            LinkedList<Integer> y_point = new LinkedList<>();
            LinkedList<Integer> x_fire = new LinkedList<>();
            LinkedList<Integer> y_fire = new LinkedList<>();
            int hour = 0;

            for(int j = 0; j < n; j++){
                String str = sc.nextLine();
                for(int k = 0; k < m; k++){
                    arr[j][k] = str.charAt(k);
                    if(arr[j][k] == '*'){ // 불의 현재 위치 저장
                        x_fire.add(j);
                        y_fire.add(k);
                    }else if(arr[j][k] == '@'){ // 상윤의 현재 위치 저장
                        x_point.add(j);
                        y_point.add(k);
                    }
                }
            }
            int fire_num = x_fire.size(); // 현재 불의 수
            int sangyoun = 1; //상윤의 현재 위치 수
            boolean stop = false; // true 인경우는 상윤이 탈출한 것

            while(!x_point.isEmpty()) {
                int temp = 0;
                //상윤에 대해서 먼저 인접한 곳으로 이동한다
                while (sangyoun != 0) {
                    int a = x_point.pollFirst();
                    int b = y_point.pollFirst();
                    sangyoun--;
                    if (arr[a][b] == '@') { //상윤먼저 이동하고 불의 이동경로를 확인하기에 불에 휩싸인 곳이 아닌경우에만
                        for (int l = 0; l < 4; l++) {
                            int c = a + ch_x[l];
                            int d = b + ch_y[l];
                            if (c >= 0 && c < n && d >= 0 && d < m) {
                                if (arr[c][d] == '.') {
                                    x_point.add(c);
                                    y_point.add(d);
                                    arr[c][d] = '@';
                                    temp++;
                                }
                            } else { // 배열 밖으로 나가게 되는 경우는 상윤이 탈출한 경우 이다
                                stop = true;
                                break;
                            }
                        }
                        if (stop == true) {
                            break;
                        }
                    }
                }
                sangyoun = temp;
                temp = 0;
                //불의 인접경로를 불로 바꾼다
                while(fire_num != 0){
                    int a = x_fire.pollFirst();
                    int b = y_fire.pollFirst();
                    fire_num--;
                    for(int l = 0; l < 4; l++){
                        int c = a + ch_x[l];
                        int d = b + ch_y[l];
                        if(c >= 0 && c < n && d >= 0 && d < m){
                            if(arr[c][d] == '.' || arr[c][d] == '@'){ // 상윤 다음에 하는 것이기에 다음 이동경로가 상윤이거나 . 인경우 이동
                                x_fire.add(c);
                                y_fire.add(d);
                                arr[c][d] = '*';
                                temp++;
                            }
                        }
                    }
                }
                fire_num = temp;
                hour++; // 시간 증가
                if(stop == true){
                    break;
                }
            }
            if(stop == true){
                System.out.println(hour);
            }else{
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}

