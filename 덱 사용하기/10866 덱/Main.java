import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static Deque<Integer> De = new LinkedList<>();
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(str.equals("push_front")){
                int num = sc.nextInt();
                push_front(num);
            }else if(str.equals("push_back")){
                int num = sc.nextInt();
                push_back(num);
            }else if(str.equals("pop_front")){
                pop_front();
            }else if(str.equals("pop_back")){
                pop_back();
            }else if(str.equals("size")){
                size();
            }else if(str.equals("empty")){
                empty();
            }else if(str.equals("front")){
                front();
            }else if(str.equals("back")){
                back();
            }
            sc.nextLine();
        }

    }

    private static void push_front(int i){
        De.addFirst(i);
    }

    private static void push_back(int i){
        De.addLast(i);
    }

    private static void pop_front(){
        if(De.size() == 0){
            System.out.println(-1);
        }else{
            System.out.println(De.pollFirst());
        }
    }

    private static void pop_back(){
        if(De.size() == 0){
            System.out.println(-1);
        }else{
            System.out.println(De.pollLast());
        }
    }

    private static void size(){
        System.out.println(De.size());
    }

    private static void empty(){
        if(De.size() == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    private static void front(){
        if(De.size() == 0){
            System.out.println(-1);
        }else{
            System.out.println(De.peekFirst());
        }
    }

    private static void back(){
        if(De.size() == 0){
            System.out.println(-1);
        }else{
            System.out.println(De.peekLast());
        }
    }

}
