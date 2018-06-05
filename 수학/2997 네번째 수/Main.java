import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> arr = new LinkedList<>();

        int result = 0;
        for(int i = 0; i < 3; i++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        int x = arr.get(2) - arr.get(1);
        int y = arr.get(1) - arr.get(0);

        if(x == y){ // 같으면 가장 큰 수에 + 차이 만큼한다
            result = arr.get(2) + x;
        }else if(x > y){// 두 차이가 다르고 x가 크다면 가운데 값에 더 작은 차이인 y를 더해준다
            result = arr.get(1) + y;
        }else{// y가 더 크다면 가장 작은 수에 더 작은 차이인 x를 더한다
            result = arr.get(0) + x;
        }

        System.out.println(result);

    }
}


