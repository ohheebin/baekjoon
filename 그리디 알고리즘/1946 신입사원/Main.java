import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static long l = 0;
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(bw.readLine());
        for(int i = 0; i < t; i++){
            int n = Integer.valueOf(bw.readLine());
            long[][] arr = new long[n][2];
            for(int j = 0; j < n; j++){
                String[] str = bw.readLine().split(" ");
                arr[j][0] = Integer.valueOf(str[0]);
                arr[j][1] = Integer.valueOf(str[1]);
                if(arr[j][1] == 1){
                    l = arr[j][0];
                }
            }
            
            //이중배열의 첫번째 항의로 오름차순!!
            Arrays.sort(arr, new Comparator<long[]>() {
                @Override
                public int compare(long arr1[], long arr2[]) {
                    return Long.compare(arr1[0], arr2[0]);
                }
            });

            long count = 1;
            long min = arr[0][1];

            //오름차순으로 등수를 정렬했기에 성적 등수가 min값보다 작다면 적어도 하나는 작은 등수이기에 count + 1
            for(int j = 1; j < l; j++){
                if(min > arr[j][1]){
                    count++;
                    min = arr[j][1];
                }
            }
            System.out.println(count);
        }


    }

}

