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
        int[][] arr = new int[n][n];
        int[][] list = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            LinkedList<Integer> check = new LinkedList<>();
            for(int j = 0; j < n; j++){
                //한줄씩 갈수있는 도로를 확인해서 list에 저장한다
                if(arr[i][j] == 1){
                    list[i][j] = 1;
                    check.add(j);
                    //갈수있는 도로의 인접도로를 다시 찾아서 그 위치를 1로 한다
                    while(!check.isEmpty()){
                        int x = check.pollFirst();
                        for(int k = 0; k < n; k++){
                            if(arr[x][k] == 1 && list[i][k] != 1){
                                list[i][k] = 1;
                                check.add(k);
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(list[i][j]);
                if(j != n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

