import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            boolean check = true;
            int j = 1;
            Deque<Integer> De = new LinkedList<>();
            //입력 값들
            String str = sc.nextLine();
            int m = sc.nextInt();
            sc.nextLine();
            String list = sc.nextLine();

            //입력값 list의 정수 값만 뽑아내서 deque에 저장한다
            while(j < list.length()){
                if(list.length() == 2){
                    break;
                }
                String num = "";
                while(true){
                    if(list.charAt(j) == ',' || j == list.length() - 1){
                        break;
                    }
                    num += list.charAt(j);
                    j++;
                }
                De.addLast(Integer.parseInt(num));
                j++;
            }

            //reverse 값을 통해 덱이 반전됐는지 그대로 인지 확인한다
            int k = 0;
            boolean reverse = false;
            while (k < str.length()) {
                if (str.charAt(k) == 'D') {
                    //만약 D는 존재하는데 덱에 정수가 존재하지 않는경우 error 출력 후 check 를 false로 바꿔준다
                    if (De.size() == 0) {
                        System.out.println("error");
                        check = false;
                        break;
                    }
                    if(reverse == false) {
                        De.pollFirst();
                    }else{
                        De.pollLast();
                    }
                } else if (str.charAt(k) == 'R') {
                    //deque 을 바꾸지 않고 bool값을 true, false로 바꿔서 앞을 제거하거 뒤를 제거하게 한다
                    if(reverse == false) {
                        reverse = true;
                    }else{
                        reverse = false;
                    }
                }
                k++;
            }
            //error 없이 출력
            if (check == true) {
                System.out.print("[");
                while (De.size() != 0) {
                    if (De.size() == 1) {
                        if(reverse == false) {
                            System.out.print(De.pollFirst());
                        }else{
                            System.out.print(De.pollLast());
                        }
                    } else {
                        if(reverse == false) {
                            System.out.print(De.pollFirst());
                        }else{
                            System.out.print(De.pollLast());
                        }
                        System.out.print(",");
                    }
                }
                System.out.print("]\n");
            }
        }
    }
}
