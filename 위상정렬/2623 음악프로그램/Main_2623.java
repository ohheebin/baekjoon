/**
 * Created by heebin on 2018. 5. 9..
 */
import java.util.*;
public class Main_2623 {
    public static LinkedList<Integer> graph[];
    public static int n, indegree[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int m = sc.nextInt();
        indegree = new int[n + 1];
        int num = 0;
        graph = new LinkedList[n + 1];

        for(int i = 1; i <= n; i++){
            graph[i] = new LinkedList<Integer>();
        }


        for(int i = 0; i < m; i++){
            int k = sc.nextInt();
            for(int j = 0; j < k; j++){
                int input = sc.nextInt();
                if(j != 0){
                    graph[num].add(input);
                    indegree[input]++;
                }
                num = input;
            }
        }
        topologicalSort();
    }
    private static void topologicalSort(){
        Queue<Integer> searchQ = new LinkedList<>(); // 탐색 큐
        Queue<Integer> resultQ = new LinkedList<>(); // 결과 큐


        /* 초기 진입차수가 0 인 노드 탐색 후 탐색 큐에 삽입 */
        for(int a = 1; a <= n; a++){
            if(indegree[a] == 0){
                searchQ.offer(a);
            }
        }

        /* 탐색 큐가 빌 때까지 계속해서 탐색 */
        while(!searchQ.isEmpty()){

            //진입노드가 0인 노드와 연결된 노드를 탐색하기 위해 저장
            int zeroIndegreeNode = searchQ.poll();
            resultQ.offer(zeroIndegreeNode); // 진입노드 0 = 정렬완료 -> 결과 큐에 삽입

            //linkedNode = 진입노드가 0인 노드와 연결되어 있던 노드
            for(int linkedNode : graph[zeroIndegreeNode]){

                //진입노드 0인 노드들을 제거하므로 연결되어있던 노드들의 차수 - 1
                indegree[linkedNode]--;

                if(indegree[linkedNode] == 0){ //연결된 노드 진입차수 수정 결과가 0이면
                    searchQ.offer(linkedNode); // 추후 탐색을 위해 탐색 큐에 삽입
                }
            }
        }
        // 순서를 정하는 것이 가능하다면 가수의 수만큼 resultQ에 저장되어있을 것이고 그 수만큼 저장되어있지 않다면 순서를 정하는것이 불가능 한것이다.
        if(resultQ.size() == n) {
            while (!resultQ.isEmpty()) {
                System.out.println(resultQ.poll());
            }
        }else{
            System.out.println(0);
        }
    }
}
