import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            for(int j = 0; j < m; j++){
                A[i][j] = (int)str.charAt(j) - 48;
            }
        }

        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            for(int j = 0; j < m; j++){
                B[i][j] = (int)str.charAt(j) - 48;
            }
        }
        int count = 0;
        //다르다면 3*3의 영역의 숫자를 바꾼다
        //그렇기에 n - 3, m - 3 만큼의 숫자만 비교하면 된다
        for(int i = 0; i <= n - 3; i++){
            for(int j = 0; j <= m - 3; j++){
                //다른 숫자면 3*3영역만큼 숫자를 변형시킨다
                if(A[i][j] != B[i][j]){
                    count++;
                    for(int x = i; x < i + 3; x++){
                        for(int y = j; y < j + 3; y++){
                            if(A[x][y] == 0){
                                A[x][y] = 1;
                            }else{
                                A[x][y] = 0;
                            }
                        }
                    }
                }
            }
        }
        //비교해서 다른 값이 있다면 check = false => -1출력
        boolean check = true;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(A[i][j] != B[i][j]){
                    check = false;
                    break;
                }
            }
            if(check == false){
                break;
            }
        }

        if(check == false){
            System.out.println(-1);
        }else{
            System.out.println(count);
        }

    }

}

