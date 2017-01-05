import java.util.Scanner;

/**
 * Created by heebin on 2017-01-05.
 */
public class score {
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
