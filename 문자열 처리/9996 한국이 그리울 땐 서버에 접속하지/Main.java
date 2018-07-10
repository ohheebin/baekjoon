import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(bw.readLine());
        String str = bw.readLine();
        String[] result = new String[n];

        for(int i = 0; i < n; i++){
            String ch = bw.readLine();
            int num = 0;
            int temp = 0;
            int stop = 0;
            boolean check = false;
            if(ch.charAt(0) == str.charAt(0)) {
                for(int j = 0; ; j++){ // 왼쪽부터 *이 나올때까지 같은지 확인한다
                    if(str.charAt(num) == '*'){
                        temp = j;
                        stop = num; // *의 위치값 저장
                        break;
                    }
                    if(str.charAt(num) != ch.charAt(j)){
                        check = true;
                        break;
                    }
                    num++;
                }
                if(check != true){
                    num = str.length() - 1;
                    //오른쪽부터 *이 나올떄까지 같은지 확인한다
                    for(int j = ch.length() - 1; j >= temp; j--){
                        if(str.charAt(num) == '*'){
                            break;
                        }
                        if(str.charAt(num) != ch.charAt(j)){
                            check = true;
                            break;
                        }
                        num--;
                    }
                }
                //우측과 좌측을 비교했을때 두개의 별의 위치값이 다르면 NE
                if(num != stop){
                    check = true;
                }
            }else{
                check = true;
            }

            if(check == true){
                result[i] = "NE";
            }else{
                result[i] = "DA";
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(result[i]);
        }
    }
}

