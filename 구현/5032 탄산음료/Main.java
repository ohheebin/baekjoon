import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt(); //가지고 있는 빈병의 수
        int f = sc.nextInt(); //주운 빈병의 수
        int c = sc.nextInt(); //새병으로 바꿀때 필요한 빈병의 수

        int sum = e + f; //총 빈병의 수
        int count = 0;
        while(true){
            if(sum < c){
                break;
            }else if(sum >= c){
                count++;
                sum -= c;
                sum += 1; // 탄산을 사먹었기에 병 하나가 증가한다
            }
        }
        System.out.println(count);
    }
}


