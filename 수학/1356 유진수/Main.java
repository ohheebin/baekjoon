import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        //한글자인 경우에는 NO출력
        if(str.length() == 1){
            System.out.println("NO");
        }
        
        for(int i = 0; i < str.length()-1; i++){

            int mlt_a = 1;
            int mlt_b = 1;
            for(int j = 0; j <= i; j++){
                mlt_a *= Integer.parseInt(Character.toString(str.charAt(j)));
            }
            for(int j = i+1; j < str.length(); j++){
                mlt_b *= Integer.parseInt(Character.toString(str.charAt(j)));
            }

            if(mlt_a == mlt_b){
                System.out.println("YES");
                break;
            }
            if(i == str.length()-2){
                System.out.println("NO");
            }
        }
    }
}


