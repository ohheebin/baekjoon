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

        Character[][] arr = new Character[n][n]; // 정상인 사람
        Character[][] off_arr = new Character[n][n]; //색약인 사람

        LinkedList<Integer> x = new LinkedList<>();
        LinkedList<Integer> y = new LinkedList<>();
        char B = 'B';
        sc.nextLine();

        for(int i = 0;i < n; i++){
            String str = sc.nextLine();
            for(int j = 0; j < n; j++){
                arr[i][j] = str.charAt(j);
                if(arr[i][j] != B){
                    off_arr[i][j] = 'R'; //색약인 사람은 파란색이 아니면 전부 빨간색으로 저장한다
                }else{
                    off_arr[i][j] = arr[i][j];
                }
            }
        }

        boolean[][] green_on = new boolean[n][n]; //정상인 사람
        boolean[][] green_off = new boolean[n][n]; //색약인 사람
        int on_num = 0; //정상인 사람의 구역 수
        int off_num = 0; //색약인 사람의 구역 수
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                //정상인 사람
                if(green_on[i][j] == false){
                    char ch = arr[i][j];
                    green_on[i][j] = true;
                    x.add(i);
                    y.add(j);
                    while(!x.isEmpty()){
                        int a = x.pollFirst();
                        int b = y.pollFirst();
                        for(int k = 0; k < 4; k++){
                            if(a+check[k][0] >= 0 && a+check[k][0] < n && b+check[k][1] >= 0 && b+check[k][1] < n){
                                if(green_on[a+check[k][0]][b+check[k][1]] == false && arr[a+check[k][0]][b+check[k][1]] == ch){
                                    green_on[a+check[k][0]][b+check[k][1]] = true;
                                    x.add(a+check[k][0]);
                                    y.add(b+check[k][1]);
                                }
                            }
                        }
                    }
                    on_num++;
                }
                //색약인 사람
                if(green_off[i][j] == false){
                    char ch = off_arr[i][j];
                    green_off[i][j] = true;
                    x.add(i);
                    y.add(j);
                    while(!x.isEmpty()){
                        int a = x.pollFirst();
                        int b = y.pollFirst();
                        for(int k = 0; k < 4; k++){
                            if(a+check[k][0] >= 0 && a+check[k][0] < n && b+check[k][1] >= 0 && b+check[k][1] < n){
                                if(green_off[a+check[k][0]][b+check[k][1]] == false && off_arr[a+check[k][0]][b+check[k][1]] == ch){
                                    green_off[a+check[k][0]][b+check[k][1]] = true;
                                    x.add(a+check[k][0]);
                                    y.add(b+check[k][1]);
                                }
                            }
                        }
                    }
                    off_num++;
                }
            }
        }
        System.out.println(on_num+" "+off_num);
    }
}

