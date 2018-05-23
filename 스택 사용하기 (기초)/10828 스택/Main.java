import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Stack st = new Stack();
    public static int top = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String str = sc.next();
            if(str.equals("push")){
                push(sc.nextInt());
            }else if(str.equals("pop")){
                pop();
            }else if(str.equals("size")){
                size();
            }else if(str.equals("empty")){
                empty();
            }else if(str.equals("top")){
                top();
            }
        }

    }

    private static void push(int i){
        st.push(i);
    }

    private static void pop(){
        if(st.empty()){
            System.out.println(-1);
        }else{
            System.out.println(st.pop());
        }
    }

    private static void size(){
        System.out.println(st.size());
    }

    private static void empty(){
        if(st.empty()){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    private static void top(){
        if(st.empty()){
            System.out.println(-1);
        }else{
            System.out.println(st.peek());
        }
    }
}
