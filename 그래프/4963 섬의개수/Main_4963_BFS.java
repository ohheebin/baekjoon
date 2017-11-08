import java.util.*;
public class Main_4963_BFS {
    private static int[][] map = new int[52][52];
    private static boolean[][] check = new boolean[52][52];
    private static int w;
    private static int h;
    private static int[] dx = {-1,-1,0,1,1,1,0,-1};
    private static int[] dy = {0,-1,-1,-1,0,1,1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            int count = 0;



            if(w == 0 && h == 0){
                break;
            }

            for(int i = 1; i <= h; i++){
                for(int j = 1; j <= w; j++) {
                    map[i][j] = 0;
                    check[i][j] = false;
                }
            }

            for(int i = 1; i <= h; i++){
                for(int j = 1; j <= w; j++){
                    map[i][j] = sc.nextInt();
                }
            }

            for(int i = 1; i <= h; i++){
                for(int j = 1; j <= w; j++){
                    if(map[i][j] == 1 && check[i][j] == false) {
                        //BFS
                        Queue<Node> q = new LinkedList<>();
                        q.add(new Node(i,j));
                        while(!q.isEmpty()){
                            Node cur = q.poll();//가져오면서 제거
                            check[cur.y][cur.x] = true;
                            for(int k = 0; k < 8; k++) {
                                int ny = cur.y + dy[k];
                                int nx = cur.x + dx[k];
                                if(1 <= nx && nx <= w && 1<= ny && ny <= h){
                                    if(check[ny][nx] == false && map[ny][nx] ==1){
                                        q.add(new Node(ny,nx));
                                    }
                                }
                            }
                        }//BFS
                        count += 1;
                    }
                }
            }
            System.out.println(count);
        }

    }

    public static class Node{
        int y, x;

        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}

