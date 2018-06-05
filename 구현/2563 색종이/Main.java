import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] arr = new int[101][101];

        //각각 색종이가 있는 정사각형을 1로 만들어 준다
        for(int i = 0; i < t; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = x; j < x+10; j++){
                for(int k = y; k < y+10; k++){
                    arr[j][k] = 1;
                }
            }
        }
        //1이 있는 배열은 색종이가 있는 것이기에 count를 1 증가시켜 모든 넓이를 구해준다
        int count = 0;
        for(int i = 0; i <= 100; i++){
            for(int j = 0; j <= 100; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}


