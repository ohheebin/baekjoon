import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String str = bw.readLine();
        String joi = "JOI";
        String ioi = "IOI";
        int joi_num = 0;
        int ioi_num = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'J'){
                for(int j = 0; j < 3; j++){
                    if(i+j >= str.length() || joi.charAt(j) != str.charAt(i+j)){
                        break;
                    }
                    if(j == 2){
                        joi_num++;
                    }
                }
            }
            if(str.charAt(i) == 'I'){
                for(int j = 0; j < 3; j++){
                    if(i+j >= str.length() || ioi.charAt(j) != str.charAt(i+j)){
                        break;
                    }
                    if(j == 2){
                        ioi_num++;
                    }
                }
            }
        }
        System.out.println(joi_num);
        System.out.println(ioi_num);
    }
}

