import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String str = bw.readLine();
        int[] arr = new int[2]; // 0 => sad 1 => happy
        String sad = ":-(";
        String happy = ":-)";
        String temp = "";
        for(int i = 0; i < str.length() - 2; i++){
            temp += str.charAt(i);
            temp += str.charAt(i+1);
            temp += str.charAt(i+2);
            if(temp.equals(sad)){
                arr[0]++;
            }else if(temp.equals(happy)){
                arr[1]++;
            }
            temp = "";
        }

        if(arr[0] == 0 && arr[1] == 0){
            temp = "none";
        }else if(arr[0] > arr[1]){
            temp = "sad";
        }else if(arr[1] > arr[0]){
            temp = "happy";
        }else if(arr[1] == arr[0]){
            temp = "unsure";
        }
        System.out.println(temp);
    }
}

