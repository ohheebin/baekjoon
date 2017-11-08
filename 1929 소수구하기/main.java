/**
 * Created by heebin on 2017-01-05.
 */
//소수 구하는 프로그램
import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        //최대값만큼의 boolean 배열을 생성한후 false로 초기화한다.
        boolean[] check = new boolean[max+1];
        //1은 소수이다.
        check[1] = true;
        //2부터 최대값까지의 값들중 소수인 수의 배수들의 값들은 소수가 아니기에 true로 바꿔서 제외시킨다.
        for(int i = 2; i < max;){
            for(int j = 2; i * j <= max; j++){
                check[i*j] = true;
            }
            //다음 소수의 값을 찾기위한 for문 x가 최대값을 넘어가면 i를 최대값으로 저장해서 for문을 끝낸다.
            for(int x = i + 1; ; x++){
                if(check[x] == false){
                    i = x;
                    break;
                }
                if(x >= max){
                    i = max;
                    break;
                }
            }
        }
        //배열중에 false로 저장된 값들이 소수의 값이기에 출력시켜준다.
        for(int y = min; y <= max; y++){
            if(check[y] == false){
                System.out.println(y);
            }
        }
    }
}


