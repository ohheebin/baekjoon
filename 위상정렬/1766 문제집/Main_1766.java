/**
 * Created by heebin on 2018. 5. 4..
 */
import java.util.*;

public class Main_1766 {
    public static LinkedList<Integer> graph[];
    public static int n , indegree[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int m = sc.nextInt();
        int from , to = 0;

        graph = new LinkedList[n+1];
        indegree = new int[n+1];

        for(int i = 1; i <= n; i++){
            graph[i] = new LinkedList<Integer>();
        }

        for(int i = 0; i < m; i++){
            from = sc.nextInt();
            to = sc.nextInt();

            graph[from].add(to);
            indegree[to]++;
        }

        topologicalSort();
    }

    private static void topologicalSort(){
        LinkedList<Integer> searchQ = new LinkedList<>();
        LinkedList<Integer> resultQ = new LinkedList<>();

        //초기 진입차수가 0인 노드 탐색 후 탐색 큐에 삽입
        for(int a = 1; a <= n; a++){
            if(indegree[a] == 0){
                searchQ.offer(a);
            }
        }

        //탐색 큐가 빌 떄까지 계속해서 탐색
        while(!searchQ.isEmpty()){
            int zeroIndegreeNode = 0;
            //숫자가 작은 순서 대로 출력해야하기 떄문에 sort를 통해 작은 순으로 정렬시켜 준다
            Collections.sort(searchQ);
            //진입노드가 0인 노드와 연결된 노드를 탐색하기 위해 저장
            zeroIndegreeNode = searchQ.poll();
            resultQ.offer(zeroIndegreeNode); // 진입노드 0 = 정렬완료 -> 결과 큐에 삽입

            //LinkedNode = 진입노드가 0인 노드와 연결되어 있던 노드
            for(int LinkedNode : graph[zeroIndegreeNode]){

                //진입노드 0인 노드들을 제거하므로 연결되어있던 노드들의 차수 -1
                indegree[LinkedNode]--;

                if(indegree[LinkedNode] == 0){ //연결된 노드 진입차수 수정 결과가 0이면
                    searchQ.offer(LinkedNode); // 추후 탐색을 위해 탐색 큐에 삽입
                }
            }
        }
        while(!resultQ.isEmpty()){
            System.out.print(resultQ.poll()+" ");
        }
    }

}
