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

        LinkedList<Integer> arr = new LinkedList<>();
        int[][] list = new int[n+2][n+2];
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            String str = sc.nextLine();
            for(int j = 1; j <= n; j++){
                list[i][j] = Integer.valueOf(str.charAt(j-1)) - 48;
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                //1이라면 그 위치와 인접한 1들을 찾아 단지로 묶는다.
                if(list[i][j] == 1){
                    LinkedList<Integer> x = new LinkedList<>();
                    LinkedList<Integer> y = new LinkedList<>();
                    x.add(i);
                    y.add(j);
                    list[i][j] = 2; // 단지 확인을 위해 2로 변경
                    int check = 1; // 단지내 아파트 수
                    while(!x.isEmpty()){ //x list에 들어있는 값이 없다는 것은 단지가 형성되었다는 것을 의미
                        int a = x.pollFirst();
                        int b = y.pollFirst();
                        for(int k = 0; k < 4; k++){
                            if(list[a+ch_x[k]][b+ch_y[k]] == 1){
                                list[a+ch_x[k]][b+ch_y[k]] = 2;
                                x.add(a+ch_x[k]);
                                y.add(b+ch_y[k]);
                                check++;
                            }
                        }
                    }
                    arr.add(check);
                }
            }
        }
        Collections.sort(arr);
        System.out.println(arr.size());
        while(!arr.isEmpty()){
            System.out.println(arr.pollFirst());
        }
    }
}

