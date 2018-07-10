import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while(true){
            String[] str = bw.readLine().split(" ");
            if(str[0].equals("0") && str[1].equals("0")){
                break;
            }
            int n = Integer.valueOf(str[0]);
            int m = Integer.valueOf(str[1]);
            int[] arr = new int[10001];
            int max = 0;
            //순위권에 든 선수들에게 포인트를 1점씩 준다, 최고점을 찾는다
            for(int i = 0; i < n; i++){
                String[] ch = bw.readLine().split(" ");
                for(int j = 0; j < m; j++){
                    int num = Integer.valueOf(ch[j]);
                    arr[num]++;
                    if(arr[num] > max){
                        max = arr[num];
                    }
                }
            }
            int check = 0;
            //1등과 같은 점수를 가진 선수들을 0으로 만든다
            for(int i = 1; i <= 10000; i++){
                if(arr[i] == max){
                    arr[i] = 0;
                }else{
                    if(arr[i] > check){
                        check = arr[i];
                    }
                }
            }
            //2등인 선수들을 출력한다
            for(int i = 1; i <= 10000; i++){
                if(arr[i] == check){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}







