import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//여학생 2명
        int m = sc.nextInt();//남학생 1명
        int k = sc.nextInt();//인턴

        int max = 0;
        int i = k;
        int j = 0;
        while(true){
            int count = 0;
            if(i <= n && j <= m){
                int man = m - j;
                int woman = n - i;
                while(true){
                    if(man < 1 || woman < 2){
                        break;
                    }else{
                        man -= 1;
                        woman -= 2;
                        count++;
                    }
                }
                if(max < count){
                    max = count;
                }
            }
            if(j == k){
                break;
            }
            i--;
            j++;
        }
        System.out.println(max);
    }
}

