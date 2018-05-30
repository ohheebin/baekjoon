import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long V = sc.nextLong();
        long num = 0;
        long day = 0;
        while(true){
            num += A; // 낮에 올라간다
            day++; 
            if(num >= V){//낮에 정상에 올라간다면 내려가지 않기에 낮과 밤 사이에 체크한다
                break;
            }
            num -= B;//밤에 내려간다
        }
        System.out.println(day);
    }
}

