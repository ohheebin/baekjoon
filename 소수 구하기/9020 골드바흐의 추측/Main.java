import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean[] check = new boolean[10001];
        check[1] = true;
        int[] numCheck = new int[num];

        for(int x = 0; x < num; x++){
            numCheck[x] = sc.nextInt();
        }
        //소수 구하기
        for(int i = 2; i <= 10000; i++){
            for(int j = 2; i * j <= 10000; j++){
                check[i * j] = true;
            }
        }

        for(int i = 0; i < num; i++){
            int a = 1;
            int b = numCheck[i] - 1;
            int result_a = 0;
            int result_b = 0;

            while(true){

                if(check[a] == false && check[b] == false){
                    result_a = a;
                    result_b = b;
                }
                //a와 b값이 같으면 종료 전부 찾아본것이다
                if(a == b){
                    break;
                }
                a++;
                b--;

            }

            System.out.println(result_a + " " + result_b);
        }
    }
}
