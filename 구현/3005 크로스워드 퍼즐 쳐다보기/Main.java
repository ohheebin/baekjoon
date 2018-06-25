import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] str = new String[n];
        LinkedList<String> list = new LinkedList<>();
        sc.nextLine();
        int shap = '#';
        for(int i = 0; i < n; i++){
            str[i] = sc.nextLine();
        }
        // 왼쪽에서 오른쪽
        for(int i = 0; i < n; i++){
            String line = "";
            boolean check = true;
            for(int j = 0; j < m; j++){
                //#이 나온다면 그 전까지의 단어 길이가 2인 경우에만 list에 저장
                if((int)str[i].charAt(j) == shap){
                    if(line.length() < 2) {
                        line = "";
                    }else{
                        list.add(line);
                        line = "";
                    }
                }else{
                    line += str[i].charAt(j);
                }
            }
            //단어의 길이가 2 이상인 경우에만 저장
            if(line.length() >= 2){
                list.add(line);
            }
        }
        //위에서 아래
        for(int i = 0; i < m; i++){
            String line = "";
            boolean check = true;
            for(int j = 0; j < n; j++){
                if((int)str[j].charAt(i) == shap){
                    if(line.length() < 2) {
                        line = "";
                    }else{
                        list.add(line);
                        line = "";
                    }
                }else{
                    line += str[j].charAt(i);
                }
            }
            if(line.length() >= 2){
                list.add(line);
            }
        }

        Collections.sort(list);
        System.out.println(list.poll());

    }
}

