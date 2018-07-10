import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);


        while(true){
            String start = bw.readLine();
            if(start.equals("START")){
                while(true){
                    String str = bw.readLine();
                    if(str.equals("END")){
                        break;
                    }
                    for(int i = 0; i < str.length(); i++){
                        if(str.charAt(i) >= 'A' && str.charAt(i) <= 'E'){
                            int temp = str.charAt(i) + 21;
                            System.out.print((char) temp);
                        }else if(str.charAt(i) >= 'F' && str.charAt(i) <= 'Z'){
                            int temp = str.charAt(i) - 5;
                            System.out.print((char) temp);
                        }else{
                            System.out.print(str.charAt(i));
                        }
                    }
                    System.out.println();
                }
            }else if(start.equals("ENDOFINPUT")){
                break;
            }
        }
    }
}







