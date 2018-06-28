import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int[] ch_x = {1,-1,0,0}; // 하 상 좌 우
    private static int[] ch_y = {0,0,-1,1};

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n+2][m+2];
        LinkedList<Integer> x_point = new LinkedList<>();
        LinkedList<Integer> y_point = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                arr[i][j] = 1;
            }
        }

        //사각형인 부분을 0으로 만들어준다.
        for(int i = 0; i < k; i++){
            int y = sc.nextInt()+1;
            int x = sc.nextInt()+1;
            int y_right = sc.nextInt();
            int x_right = sc.nextInt();

            for(int j = x; j <= x_right; j++){
                for(int l = y; l <= y_right; l++){
                    arr[j][l] = 0;
                }
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                //1인 부분이 있다면 인접한 1들의 수를 체크한다
                if(arr[i][j] == 1){
                    int num = 1;
                    //x와 y의 좌표를 list에 저장한다
                    x_point.add(i);
                    y_point.add(j);
                    arr[i][j] = 0;
                    //인접한 1이 없을떄까지 체크해준다
                    while(!x_point.isEmpty()){
                        int x = x_point.pollFirst();
                        int y = y_point.pollFirst();
                        for(int l = 0; l < 4; l++){
                            if(arr[x+ch_x[l]][y+ch_y[l]] == 1){
                                num++;
                                arr[x+ch_x[l]][y+ch_y[l]] = 0;
                                x_point.add(x+ch_x[l]);
                                y_point.add(y+ch_y[l]);
                            }
                        }
                    }
                    result.add(num);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        while(!result.isEmpty()){
            System.out.print(result.pollFirst());
            if(result.size() != 0){
                System.out.print(" ");
            }
        }
    }
}

