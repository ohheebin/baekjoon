import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            Stack st = new Stack();
            String str = sc.nextLine();
            boolean check = true;

            //만약 ( 라면 스택에 저장한다. 그리고 ) 나온다면 스택에 저장한 (를 제거함으로써 괄호 한 세트를 완성시킨다
            //스택이 비어있지 않다면 괄호가 처리되지 않은 것이기에 NO를 출력하고 ) 가 들어오는데 스택이 비어있는 경우도 괄호가 처리되지 않는것
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == '('){
                    st.push('(');
                }else if(str.charAt(j) == ')'){
                    if(!st.empty()) {
                        st.pop();
                    }else{
                        check = false;
                        break;
                    }
                }
            }
            if(st.empty() && check == true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
