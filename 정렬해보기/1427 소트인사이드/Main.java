import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < n.length(); i++){
            list.add(Integer.parseInt(String.valueOf(n.charAt(i))));
        }

        Collections.sort(list);
        Collections.reverse(list);

        for(int i = 0; i < n.length(); i++){
            System.out.print(list.element());
            list.poll();
        }
    }
}

