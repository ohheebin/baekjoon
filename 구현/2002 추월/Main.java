import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int[] x = {-1,0,1};
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(bw.readLine());
        String[] before = new String[n]; // 차이름
        String[] after = new String[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            before[i] = bw.readLine();
        }

        for(int i = 0; i < n; i++){
            after[i] = bw.readLine();
        }
        // 자신의 앞에 있던 차들을 전부 비교해서 만약 그 차들중 하나보다 더 먼저 나갔다면 추월한 것이다
        for(int i = 1; i < n; i++){
            int k = i-1;
            boolean bool = false;
            while(k >= 0) {
                for (int j = 0; j < n; j++) {
                    if (before[k].equals(after[j])) {
                        break;
                    }
                    if (before[i].equals(after[j])) {
                        bool = true;
                        break;
                    }
                }
                k--;
                if(bool == true){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

