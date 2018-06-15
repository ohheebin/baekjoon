import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        int[] time = {1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4}; // A ~ Z 눌러야 하는 횟수
        String str = sc.nextLine();
        long sum = 0;
        int a = 0;
        int temp = 0;
        for(int i = 0; i < str.length(); i++){
            int check = (int)str.charAt(i);
            if(check != 32) {
                if(check >= 65 && check <= 67){ // A ~ C
                    temp = 2;
                    if(temp == a){
                        sum += w;
                    }
                    a = 2;
                }else if(check >= 68 && check <= 70){ // D ~ F
                    temp = 3;
                    if(temp == a){
                        sum += w;
                    }
                    a = 3;
                }else if(check >= 71 && check <= 73){ // G ~ I
                    temp = 4;
                    if(temp == a){
                        sum += w;
                    }
                    a = 4;
                }else if(check >= 74 && check <= 76){ // J ~ L
                    temp = 5;
                    if(temp == a){
                        sum += w;
                    }
                    a = 5;
                }else if(check >= 77 && check <= 79){ // M ~ O
                    temp = 6;
                    if(temp == a){
                        sum += w;
                    }
                    a = 6;
                }else if(check >= 80 && check <= 83){ // P ~ S
                    temp = 7;
                    if(temp == a){
                        sum += w;
                    }
                    a = 7;
                }else if(check >= 84 && check <= 86){ // T ~ V
                    temp = 8;
                    if(temp == a){
                        sum += w;
                    }
                    a = 8;
                }else { // W ~ Z
                    temp = 9;
                    if(temp == a){
                        sum += w;
                    }
                    a = 9;
                }
                sum += (p * time[check-65]);
            }else{ // 공백
                sum += p;
                a = 1;
            }
        }
        if(str.length() == 0){
            System.out.println(0);
        }else {
            System.out.println(sum);
        }
    }
}


