import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        String str = sc.nextLine();
        boolean check = true;

        int sum = 0;
        //먼저 괄호가 제대로 입력되었는지 검사한다.
        //제대로 입력되지 않았으면 check = false 로 두어 값을 검사하지 않고 0 을 출력한다
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                st.push('(');
            }else if(str.charAt(i) == '['){
                st.push('[');
            }else if(str.charAt(i) == ')'){
                if(st.empty() || st.peek().equals('[')){
                    check = false;
                    sum = 0;
                    break;
                }
                st.pop();
            }else if(str.charAt(i) == ']'){
                if(st.empty() || st.peek().equals('(')){
                    check = false;
                    sum = 0;
                    break;
                }
                st.pop();
            }
        }
        //stack 에 아직 남아 있다면 괄호가 제대로 입력되지 않은것
        if(!st.empty()){
            check = false;
        }
        //괄호가 제대로 입력되었다면 값을 구한다
        if(check == true) {
            for (int i = 0; i < str.length(); i++) {
                int x = 1;
                if (str.charAt(i) == '(') {
                    st.push('(');
                } else if (str.charAt(i) == '[') {
                    st.push('[');
                } else if (str.charAt(i) == ')') {
                    while (!st.peek().equals('(')) {
                        if (x == 1) {
                            x = 0;
                        }
                        x += (int) st.pop();
                    }
                    x = x * 2;
                    st.pop();
                    st.push(x);
                } else if (str.charAt(i) == ']') {
                    while (!st.peek().equals('[')) {
                        if (x == 1) {
                            x = 0;
                        }
                        x += (int) st.pop();
                    }
                    x = x * 3;
                    st.pop();
                    st.push(x);
                }
            }
            while (!st.empty()) {
                sum += (int) st.pop();
            }
        }
        System.out.println(sum);
    }
}
