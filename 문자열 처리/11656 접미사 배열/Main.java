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
        String str = bw.readLine();

        LinkedList<String> result = new LinkedList<>();

        for(int i = 0; i < str.length(); i++){
            String check = "";
            for(int j = i; j < str.length(); j++){
                check += str.charAt(j);
            }
            result.add(check);
        }

        Collections.sort(result);

        while(!result.isEmpty()){
            System.out.println(result.pollFirst());
        }
    }
}

