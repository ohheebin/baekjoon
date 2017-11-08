/**
 * Created by heebin on 2017. 10. 3..
 */
//1764번 듣보잡
import java.util.*;
public class Main17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int num = 0;
        String E_str = "";//보지도 못한 사람

        Map<String, Integer> map = new HashMap<String,Integer>();//듣지도 못한 사람 hashmap
        ArrayList<String> ans = new ArrayList<>();//hashmap에 보지도 못한 사람이있다면 저장

        for(int i = 0; i < x; i++){
            map.put(sc.next(),0);
        }
        for(int j = 0; j < y; j++){
            E_str = sc.next();
            if(map.containsKey(E_str) == true){
                ans.add(E_str);
                map.remove(E_str);
                num += 1;
            }
        }

        Collections.sort(ans);//사전순으로 정렬
        System.out.println(num);
        for(int i = 0; i < num; i++){
            System.out.println(ans.get(i));
        }

    }
}
