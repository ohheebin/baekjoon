/**
 * Created by heebin on 2017. 10. 9..
 */
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;
public class Main_4963 {
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
                        dfs(i, j);
                        count += 1;
                    }
                }
            }
            System.out.println(count);
        }

    }

    public static void dfs(int y, int x){
        check[y][x] = true;
        for(int i = 0; i < 8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx <= w && 1 <= nx && ny <= h && ny >= 1){
                if(map[ny][nx] == 1 && check[ny][nx] == false){
                    dfs(ny,nx);
                }
            }
        }
    }
}
