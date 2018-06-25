import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String[] st = bw.readLine().split(" ");
        int n = Integer.valueOf(st[0]);
        int m = Integer.valueOf(st[1]);
        String[] str = bw.readLine().split(" ");
        int[] arr = new int[n];//플러그 수
        int[] list = new int[m]; //기기
        int plug = 0;

        for(int i = 0; i < m; i++){
            list[i] = Integer.valueOf(str[i]);
        }
        int count = 0;

        for(int i = 0; i < m; i++){
            boolean isUse = false;
            for(int j = 0; j < n; j++){//같은 것이 있는지 확인
                if(arr[j] == list[i]){
                    isUse = true;
                    break;
                }
            }

            if(isUse) continue;

            isUse = false;
            for(int j = 0; j < n; j++){//콘센트가 비어있다면 꽂는다.
                if(arr[j] == 0){
                    arr[j] = list[i];
                    isUse = true;
                    break;
                }
            }

            if(isUse) continue;
            //콘센트가 꽉차있는 경우
            int max = -1;
            int num = -1;
            //가장 나중에 사용되거나 사용되지 않는 기기를 찾는다
            for(int j = 0; j < n; j++){
                int temp = 0;
                for(int k = i+1; k < m && arr[j] != list[k]; k++){
                    temp++;
                }
                if(temp > max){
                    num = j;
                    max = temp;
                }
            }
            count++;
            arr[num] = list[i];
        }

        System.out.print(count);
    }
}

