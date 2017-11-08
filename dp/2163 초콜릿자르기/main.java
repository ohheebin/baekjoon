/**
 * Created by heebin on 2017-01-05.
 */
//초콜릿 자르기 문제 1 x 1이 될때 까지 자르는 최소 횟수 문제
import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] result = new int[x+1][y+1];

        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= y; j++){
                if(i == 1 && j == 1){//x, y가 둘다 1 인경우 0
                    result[i][j] = 0;
                } else if(i == 1 && j != 1) {//x가 1인 경우 y - 1이 최소 경우의 수
                    result[i][j] = j - 1;
                } else if(i != 1 && j == 1) {//y가 1인 경우 x - 1이 최소 경우의 수
                    result[i][j] = i - 1;
                } else{ //전부 아닌 경우는 다이나믹을 이용해서 1 + 자른 초콜릿갯수의 배열의 합
                    result[i][j] = 1 + result[i][j/2] + result[i][j - (j/2)];
                }
            }
        }
        System.out.println(result[x][y]);
    }
}


