/**
 * Created by heebin on 2017-01-05.
 */
//1로 만드는 함수 중 최소 횟수를 구한다.
import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] check = new int[num+1];

        for(int i = 1; i <= num; i++){
            check[i] = oneCheck(i, check);
        }
        System.out.println(check[num]);
    }

    public static int oneCheck(int number, int[] check){
        int temp = number, temp1, temp2, temp3;
        int check1 = 1000, check2 = 1000, check3;
        if(number == 1){
            return 0;
        }
        //3으로 나눠지는 경우 비교
        if(number % 3 == 0){
            temp1 = number / 3;
            check1 = check[temp1] + 1;
        }
        //2로 나눠지는 경우 비교
        if(number % 2 == 0){
            temp2 = number / 2;
            check2 = check[temp2] + 1;
        }
        //1을 뺀후 그 배열값에 들어있는 횟수 + 1 을 해준다.
        temp3 = number - 1;
        check3 = check[temp3] + 1;
        //3을 나눈것 2를 나눈것 1을 뺀것들의 횟수를 비교해 가장 적은 횟수를 찾아낸다.
        if(check1 <= check2){
            if(check1 <= check3){
                check[temp] = check1;
            } else{
                check[temp] = check3;
            }
        } else{
            if(check2 <= check3){
                check[temp] = check2;
            } else{
                check[temp] = check3;
            }
        }
        return check[temp];
    }
}


