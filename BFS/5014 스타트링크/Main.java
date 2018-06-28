import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();//현재층
        int g = sc.nextInt();//도착할층
        int u = sc.nextInt();
        int l = sc.nextInt();
        int[] up_down = {u,-l};
        LinkedList<Integer> num = new LinkedList<>();
        boolean[] check = new boolean[n+1];
        check[m] = true;
        num.add(m);
        int ch = 1;
        int min = 0;
        boolean stop = false;

        while(true){
            int temp = 0;
            while(ch != 0) {
                int a = num.pollFirst();
                ch--;
                if(a == g){ // 스타트링크 층에 도착하면 break
                    stop = true;
                    break;
                }
                //갈수 있는 층을 확인하고 list에 넣는다
                for(int i = 0; i < 2; i++){
                    if(a+up_down[i] >= 1 && a+up_down[i] <= n){
                        if(check[a+up_down[i]] == false){
                            num.add(a+up_down[i]);
                            temp++;
                            check[a+up_down[i]] = true;
                        }
                    }
                }
            }
            if(stop == true){
                System.out.println(min);
                break;
            }
            //갈수있는 모든 층을 확인 했지만 도착하지 못할시
            if(num.isEmpty()){
                System.out.println("use the stairs");
                break;
            }
            min++;
            ch = temp;
        }
    }
}

