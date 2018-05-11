/**
 * Created by heebin on 2017. 10. 3..
 */
//4948번 베르트랑 공준
import java.util.*;
public class Main_4948 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int num = 0;
        int n = 0;
        int n2 = 0;
        int[] prime = new int[247010];

        while(1 == 1){
            num = sc.nextInt();
            if(num != 0){
                list.add(num);
            }else{
                break;
            }
        }
        //소수 구하기
        for(int i = 2; i < 498; i++){
            for(int j = i * i; j < 247010; j += i){
                prime[j] = 1;
            }
        }
        //소수인 것들의 수
        for(int i = 0; i < list.size(); i++){
            int ans = 0;
            for(int j = list.get(i)+1; j <= 2*list.get(i); j++){
                if(prime[j] == 0){
                    ans += 1;
                }
            }
            System.out.println(ans);
        }

    }
}
