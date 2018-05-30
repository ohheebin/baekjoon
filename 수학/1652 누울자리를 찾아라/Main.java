import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        boolean[][] dp = new boolean[n][n];
        String str = "";
        sc.nextLine();
        for(int i = 0; i < n; i++){
            str = sc.nextLine();
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == 'X'){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }
            }
        }
        int row = 0; //가로
        int col = 0; //세로

        for(int i = 0; i < n; i++){
            int count_row = 0;
            int count_col = 0;
            for(int j = 0; j < n; j++){
                //가로 체크
                if(arr[i][j] == 0){
                    count_row++;
                }else{
                    if(count_row >= 2){
                        row++;
                    }
                    count_row = 0;
                }
                //세로 체크
                if(arr[j][i] == 0){
                    count_col++;
                }else{
                    if(count_col >= 2){
                        col++;
                    }
                    count_col = 0;
                }
            }
            if(count_col >= 2){
                col++;
            }
            if(count_row >= 2){
                row++;
            }
        }
        System.out.print(row+" "+col);
    }
}

