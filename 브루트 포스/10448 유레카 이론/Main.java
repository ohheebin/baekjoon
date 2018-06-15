import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Integer> arr = new LinkedList<>();
        boolean[] list = new boolean[1001];

        int k = 1;

        while(true){ //1000이하까지의 삼각수의 값들을 먼저 구해낸다
            int m = ((k+1)*k) / 2;
            if(m >= 1000){
                break;
            }
            arr.add(m);
            k++;
        }
        //3부터 1000 까지 삼각수 3개로 값이 된다면 true
        for(int i = 3; i <= 1000; i++){
            for(int j = 0; j < arr.size(); j++){
                if(list[i] == true){
                    break;
                }
                for(int l = 0; l < arr.size(); l++){
                    if(list[i] == true){
                        break;
                    }
                    for(int x = 0; x < arr.size(); x++){
                        int ch = arr.get(j) + arr.get(l) + arr.get(x);

                        if(ch == i){
                            list[i] = true;
                            break;
                        }
                        if(ch > i){
                            break;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(list[sc.nextInt()] == true){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

    }
}


