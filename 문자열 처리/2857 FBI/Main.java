import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];
        String fbi = "FBI";
        LinkedList<Integer> arr = new LinkedList<>();
        for(int i = 0; i < 5; i++){
            str[i] = bw.readLine();
        }

        for(int i = 0; i < 5; i++){
            boolean check = false;
            for(int j = 0; j < str[i].length(); j++){
                if(str[i].charAt(j) == 'F'){
                    for(int k = 0; k < 3; k++){
                        if(str[i].charAt(j+k) != fbi.charAt(k)) break;
                        if(k == 2){ // FBI인 경우 list에 저장한다.
                            arr.add(i+1);
                            check = true;
                        }
                    }
                }
                if(check == true) break; // FBI인 사람의 이름을 다시 검사하지 않기 위해 break를 한다
            }
        }

        if(arr.size() == 0){ // FBI 가 없는 경우
            System.out.println("HE GOT AWAY!");
        }else{
            while(!arr.isEmpty()){
                System.out.print(arr.pollFirst()+" ");
            }
        }
    }
}

