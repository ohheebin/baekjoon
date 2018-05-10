/**
 * Created by heebin on 2018. 5. 3..
 */
//위상정렬로 문제해결 ACM Craft
import java.util.*;
public class Main_1005 {
    public static LinkedList<Integer> graph[]; //인접 리스트 그래프
    public static int n , indegree[], list[][]; //진입차수를 세기 위한 배열
    public static int time[], w; // 시간저장 배열
    public static long check[], result[];
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 문제의 갯수
        result = new long[num];

        int from , to = 0;
        int index = 0;
        for(int i = 0; i < num; i++) {
            n = sc.nextInt();
            int k = sc.nextInt();

            indegree = new int[n + 1];
            graph = new LinkedList[n + 1];
            time = new int[n + 1];
            list = new int[n + 1][n + 1];
            check = new long[n + 1];

            for (int j = 0; j <= n; j++) {
                graph[j] = new LinkedList<>(); // LinkedList 초기화
            }

            for (int j = 1; j <= n; j++) {
                time[j] = sc.nextInt();
                check[j] = time[j];
            }

            for (int j = 0; j < k; j++) {
                from = sc.nextInt();
                to = sc.nextInt();

                list[from][to] = 1;
                graph[from].add(to); // 인접리스트를 이용해 From -> to 표현
                indegree[to]++; // 진입 차수를 계산해야 하기에 to의 진입차수 + 1
            }
            w = sc.nextInt();
            topologicalSort(index);
            index++;
        }
        for(int i = 0; i < num; i++){
            System.out.println(result[i]);
        }
    }

    //위상정렬
    private static void topologicalSort(int index){
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
        while(resultQ.element() != w){
            for(int j = 1; j <= n; j++) {
                for (int z = 1; z <= n; z++) {
                    if (list[resultQ.element()][z] == 1) {
                        if (check[z] < check[resultQ.element()] + time[z]) {
                            check[z] = check[resultQ.element()] + time[z];
                        }
                    }
                }
                if(resultQ.element() == w){
                    break;
                }
                resultQ.poll();
            }
        }
        result[index] = check[w];
    }
}
