import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String[] num = bw.readLine().split(" ");
        int n = Integer.valueOf(num[0]);
        int m = Integer.valueOf(num[1]);
        HashMap<String, Integer> map = new HashMap<>(); // 키값이 포켓몬 이름
        HashMap<Integer, String> mapNum = new HashMap<>(); // 키값이 번호
        String str = "";

        for(int i = 1; i <= n; i++){
            str = bw.readLine();
            map.put(str,i);
            mapNum.put(i,str);
        }

        for(int j = 0; j < m; j++){
            String check = bw.readLine();

            int a = check.charAt(0);
            if(a >= 65 && a <= 90){ // 이름이 주어지면 포켓몬 번호를 출력한다
                System.out.println(map.get(check));
            }else{ // 번호가 주어지면 포켓몬 이름을 출력한다
                int b = Integer.valueOf(check);
                System.out.println(mapNum.get(b));
            }
        }

    }
}

