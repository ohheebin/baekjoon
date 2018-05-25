import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        LinkedList<Integer> arr = new LinkedList<>();
        int[] rank = new int[8001]; // -4000 ~ 4000 => 0 ~ 8000
        int n = 0;
        int midle = (int)Math.floor(m/2);
        double sum = 0;
        for(int i = 0; i < m; i++){
            n = sc.nextInt();
            arr.add(n);
            sum += n;
            if(n < 0){
                rank[4000 - n]++;
            }else{
                rank[n]++;
            }
        }
        //list에 값들을 넣어주고 sort합수를 이용해 정렬시켜준다 첫번째위치에 있는 값이 최소 끝값이 최대값
        Collections.sort(arr);
        int min = arr.getFirst();
        int max = arr.getLast();
        int num_max = 0;

        //최빈값을 구하기 위해 list를 통해 최빈값을 넣어주고 같은 값이 있다면 추가로 넣고 더 큰값이 나오면 list의 값을 전부제거 후 추가
        LinkedList<Integer> check = new LinkedList<>();
        //최빈값이 여러개면 2번째 작은 값을 출력해야하기에 -4000 부터 4000 까지 체크한다.
        for(int i = 8000; i >= 4001; i--){
            if(num_max < rank[i]){
                num_max = rank[i];
                while(!check.isEmpty()){
                    check.poll();
                }
                check.add(4000 - i);
            }else if(num_max == rank[i]){
                check.add(4000 - i);
            }
        }

        for(int i = 0; i <= 4000; i++){
            if(num_max < rank[i]){
                num_max = rank[i];
                while(!check.isEmpty()){
                    check.poll();
                }
                check.add(i);
            }else if(num_max == rank[i]){
                check.add(i);
            }
        }



        System.out.println((int)Math.round(sum/(double)m));
        System.out.println(arr.get(midle));

        if(check.size() >= 2){
            System.out.println(check.get(1));
        }else {
            System.out.println(check.get(0));
        }

        System.out.println(max - min);

    }
}

