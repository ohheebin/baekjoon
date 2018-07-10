import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String str = bw.readLine();
        int num = 0;
        int ka = 0;
        int da = 0;
        for(int i = 0; i < str.length(); i++) {
            //각 마디의 첫음을 비교한다
            if(num == 0){
                if(str.charAt(i) == 'A' || str.charAt(i) == 'D' || str.charAt(i) == 'E'){
                    ka++;
                }else if(str.charAt(i) == 'C' || str.charAt(i) == 'F' || str.charAt(i) == 'G'){
                    da++;
                }
            }
            num++;
            if(str.charAt(i) == '|'){
                num = 0;
            }
            if(i == str.length()-1){
                //가단조와 다장조의 합이 같은 경우에는 마지막마디의 마지막음을 비교한다
                if(ka == da){
                    if(str.charAt(i) == 'A' || str.charAt(i) == 'D' || str.charAt(i) == 'E'){
                        ka++;
                    }else if(str.charAt(i) == 'C' || str.charAt(i) == 'F' || str.charAt(i) == 'G'){
                        da++;
                    }
                }
            }
        }

        if(ka > da){
            System.out.println("A-minor");
        }else if(ka < da){
            System.out.println("C-major");
        }
    }
}







