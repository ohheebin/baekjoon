import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static LinkedList<LinkedList<Integer>> list;
    private static int ans, drop = 0;
    private static boolean[] bool;
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        list = new <LinkedList<Integer>> LinkedList();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            list.add(new <Integer> LinkedList());
        }
        LinkedList<Integer> root = new LinkedList<>();
        bool = new boolean[n];
        for(int i = 0; i < n; i++){
            int k = sc.nextInt();
            arr[i] = k;
            if(k == -1){
                root.add(i); // root 노드를 저장한다
            }else{
                list.get(k).add(i);
                arr[i] = k; // 삭제할 노드의 부모 노드를 찾기 위해
            }
        }

        drop = sc.nextInt();
        //부모노드로 삭제할 노드를 삭제 삭제(root가 아닌경우에)
        if(arr[drop] != -1) {
            for (int i = 0; i < list.get(arr[drop]).size(); i++) {
                if (list.get(arr[drop]).get(i) == drop) {
                    list.get(arr[drop]).remove(i);
                }
            }
        }
        delete(drop); // 삭제할 노드의 자식 노드들을 삭제한다

        while(!root.isEmpty()){ // 루트 노드를 통해 리프 노드를 찾아서 count를 1 증가 시킨다
            find(root.pollFirst());
        }
        System.out.println(ans);

    }

    public static void delete(int drop){
        while(!list.get(drop).isEmpty()){
            int a = list.get(drop).pollFirst();
            delete(a);
        }
    }

    public static void find(int root){
        if (list.get(root).size() == 0 && bool[root] == false) {
            if(root != drop) {
                ans++;
                bool[root] = true; // 부모 노드가 2개인 경우를 체크하기 위해
            }
        }else {
            for(int i = 0; i < list.get(root).size(); i++){
                int a = list.get(root).get(i);
                if(a != drop && bool[root] == false){
                    find(a);
                }
            }
        }
    }
}

