import java.util.*;
public class Main_9498 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        char ch;
        score = sc.nextInt();
        if(score>= 90 && score <= 100){
            ch = 'A';
        } else if(score >= 80 && score <= 89){
            ch = 'B';
        } else if(score >= 70 && score <= 79){
            ch = 'C';
        } else if(score >= 60 && score <= 69){
            ch = 'D';
        } else{
            ch = 'F';
        }
        System.out.println(ch);
    }
}