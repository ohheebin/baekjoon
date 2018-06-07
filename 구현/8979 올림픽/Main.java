import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] list = new int[n+1][5]; // 0은 국가명 1은 금 2는 은 3은 동 4는 등수

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < 4; j++){
                list[i][j] = sc.nextInt();
            }
            list[i][4] = 1; // 전부 등수 1로 초기화
        }

        for(int i = 1; i <= n; i++){ // 첫번째 국가 부터 등수를 체크한다
            for(int j = i+1; j <= n; j++){ // 다음 국가와의 등수를 체크해나간다
                if(i != j){
                    for(int l = 1; l < 4; l++){
                        if(list[i][l] > list[j][l]){
                            list[j][4]++;
                            break;
                        }else if(list[i][l] < list[j][l]){
                            list[i][4]++;
                            break;
                        }
                    }
                }
            }
        }

        for(int i = 1; i <= n; i++){
            if(list[i][0] == k){
                System.out.println(list[i][4]);
            }
        }
    }
}


