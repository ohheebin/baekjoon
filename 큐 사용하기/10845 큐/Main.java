import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    public static Queue<Integer> Q = new LinkedList<>();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(str.equals("push")){
                push(sc.nextInt());
            }
            else if(str.equals("pop")){
                pop();
            }
            else if(str.equals("size")){
                size();
            }
            else if(str.equals("empty")){
                empty();
            }
            else if(str.equals("front")){
                front();
            }
            else if(str.equals("back")){
                back();
            }
            sc.nextLine();
        }

    }

    private static void push(int i){
        Q.offer(i);
    }

    private static void pop(){
        if(Q.isEmpty()){
            System.out.println("-1");
        }else{
            System.out.println(Q.element());
            Q.poll();
        }
    }

    private static void size(){
        System.out.println(Q.size());
    }

    private static void empty(){
        if(Q.isEmpty()){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

    private static void front(){
        if(Q.isEmpty()){
            System.out.println("-1");
        }else{
            System.out.println(Q.element());
        }
    }

    private static void back(){
        Queue<Integer> Q_temp = new LinkedList<>();
        int size = Q.size();
        if(Q.isEmpty()){
            System.out.println("-1");
        }else{
            for(int i = 1; i <= size; i++){
                if(i == size){
                    System.out.println(Q.element());
                }
                Q.offer(Q.element());
                Q.poll();
            }
        }
    }
}
