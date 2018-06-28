import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int[] ch = {1,-1};

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        LinkedList<Integer> arr = new LinkedList<>();
        int[] list = new int[100001];
        int min = 0;

        if(n < m) {
            list[n] = 1;
            arr.add(n);
            int check = 1;
            boolean stop = false;
            //현재 위치 에서 *2와 +1 , -1을 해서 list에 넣어준다 들렸던 장소는 1로 체크해준다
            while (true) {
                int temp = 0;
                while (check != 0) {
                    check--;
                    int x = arr.pollFirst();
                    if (x == m) {
                        stop = true;
                        break;
                    }
                    int k = x * 2;
                    if (k <= 100000 && list[k] != 1) {
                        arr.add(k);
                        list[k] = 1;
                        temp++;
                    }
                    for (int i = 0; i <= 1; i++) {
                        k = x + ch[i];
                        if (k >= 0 && k <= m) {
                            if (list[k] != 1) {
                                arr.add(k);
                                list[k] = 1;
                                temp++;
                            }
                        }
                    }

                }
                if (stop == true) {
                    break;
                }
                min++;
                check = temp;
            }
        }else{ // n이 더 큰경우는 -1밖에 없기에 n-m
            min = n-m;
        }
        System.out.println(min);
    }
}

