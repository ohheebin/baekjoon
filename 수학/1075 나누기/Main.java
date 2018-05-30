import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        String check = Long.toString(a);
        String temp = "";
        //a의 마지막 두자리를 00으로 바꿔준다
        for(int i = 0; i < check.length(); i++){
            if(i >= check.length()-2){
                temp += "0";
            }else{
                temp += check.charAt(i);
            }
        }
        a = Long.valueOf(temp);
        //나머지가 없을때까지 a를 1씩 증가시킨다
        while(true){
            if(a % b == 0){
                break;
            }
            a++;
        }
        check = Long.toString(a);
        for(int i = check.length()-2; i < check.length(); i++){
            System.out.print(check.charAt(i));
        }
    }
}

