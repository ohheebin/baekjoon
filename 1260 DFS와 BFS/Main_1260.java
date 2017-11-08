/**
 * Created by heebin on 2017. 10. 9..
 */
import java.util.*;
public class Main_1260 {
    public static ArrayList<Integer>[] list;
    public static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int point = sc.nextInt();
        int line = sc.nextInt();
        int start = sc.nextInt();
        list = (ArrayList<Integer>[]) new ArrayList[point+1];

        for (int i=1; i<=point; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < line; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            list[x].add(y);
            list[y].add(x);
        }

        for (int i=1; i<=point; i++) {
            Collections.sort(list[i]);
        }
        check = new boolean[point+1];
        DFS(start);
        System.out.println();
        check = new boolean[point+1];
        BFS(start);

    }

    public static void DFS(int x){
        if(check[x] == true){
            return;
        }
        check[x] = true;
        System.out.print(x+" ");
        for(int i : list[x]){
            if(check[i] == false){
                DFS(i);
            }
        }
    }

    public static void BFS(int start){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        check[start] = true;
        while (!q.isEmpty()) {
            int x = q.remove();
            System.out.print(x + " ");
            for (int y : list[x]) {
                if (check[y] == false) {
                    check[y] = true;
                    q.add(y);
                }
            }
        }
    }
}
