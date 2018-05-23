import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String args[]) throws IOException {
        //scanner 는 시간이 오래걸리기 때문에 bufferedReader로 입력값을 받아준다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack st = new Stack();
        int n = Integer.parseInt(br.readLine());
        int j = 1;
        boolean check = true;
        //String도 시간이 오래걸리기 때문에 StringBuilder로 문자열을 저장시켜준다
        StringBuilder str = new StringBuilder();

        for(int i = 1; i <= n; i++){
            int m = Integer.parseInt(br.readLine());
            if(check == false){
                System.out.println("NO");
                break;
            }
            while(true){
                if(!st.empty() && st.peek().equals(m)){
                    st.pop();
                    str.append("-");
                    break;
                }else {
                    if(j > n){
                        check = false;
                        break;
                    }
                    st.push(j);
                    str.append("+");
                    j++;
                }
            }
        }
        if(check == true){
            for(int i = 0; i < str.length(); i++){
                System.out.println(str.charAt(i));
            }
        }
    }
}
