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
        int[][] arr = new int[n][m];
        boolean[][] ch = new boolean[n][m];
        int[][] rock = new int[n][m];
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            for(int j = 0; j < m; j++){
                arr[i][j] = str.charAt(j) - 48;
                rock[i][j] = arr[i][j];
            }
        }

        LinkedList<Integer> x = new LinkedList<>(); // x좌표
        LinkedList<Integer> y = new LinkedList<>(); // y좌표

        //시작점을 저장한다
        x.add(0);
        y.add(0);
        int step = 1; //한번움직일때 인접한 칸이 몇개인지 확인하기 위해
        int num = 1;
        boolean stop = false;
        ch[0][0] = true;

        //바위를 하나도 안부시는 경우
        while(!x.isEmpty()){
            int temp = 0;
            while(step != 0){
                int a = x.pollFirst();
                int b = y.pollFirst();
                if(a == n-1 && b == m-1){
                    stop = true;
                    break;
                }
                step--;
                for(int i = 0; i < 4; i++){
                    int k = a + check[i][0];
                    int l = b + check[i][1];
                    if(k >= 0 && k < n && l >= 0 && l < m){
                        if(arr[k][l] == 0){
                            if(ch[k][l] == false) {
                                x.add(k);
                                y.add(l);
                                ch[k][l] = true;
                                temp++;
                                //그전 길이 벽을 뚫고 왔으면 뚤고온 길로 저장
                                if(rock[a][b] == 1){
                                    rock[k][l] = 1;
                                }
                            }else{
                                //ch 가 true이지만 한번 벽을 뚫고 온것과 뚫지 않고 온길이면 뚫지 않고 왔다고 check하고 다시 저장한다
                                if(rock[k][l] > rock[a][b]){
                                    rock[k][l] = 0;
                                    x.add(k);
                                    y.add(l);
                                    temp++;
                                }
                            }
                        }else if(arr[k][l] == 1 && ch[k][l] == false){
                            //벽이 있고 그전에 뚫지 않았다면 벽을 뚫고 rock을 1 로 변경한다
                            if(rock[a][b] == 0){
                                x.add(k);
                                y.add(l);
                                rock[k][l] = 1;
                                ch[k][l] = true;
                                temp++;
                            }
                        }
                    }
                }
            }
            if(stop == true){
                break;
            }
            step = temp;
            num++;
        }
        if(stop == true){
            System.out.println(num);
        }else{
            System.out.println(-1);
        }
    }
}

