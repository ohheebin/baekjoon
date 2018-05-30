import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        String temp_A = Integer.toString(A);
        String temp_B = Integer.toString(B);

        int check = A + B; // 5와 6을 제대로 본 경우
        int min = check;
        int max = check;

        for(int j = 0; j < 3; j++) {
            check = temp(j,temp_A) + temp(j,temp_B);
            if(min > check){
                min = check;
            }
            if(max < check){
                max = check;
            }
        }
        System.out.println(min+" "+max);
    }

    // 5와 6을 바꿔주는 함수
    private static int temp(int i , String a){
        String temp = "";
        for(int j = 0; j < a.length(); j++) {
            if (i == 0) {// 5는 제대로 6을 5로
                if (a.charAt(j) == '6') {
                    temp += '5';
                } else {
                    temp += a.charAt(j);
                }
            } else if (i == 1) {// 5를 6으로 6은 제대로
                if (a.charAt(j) == '5') {
                    temp += '6';
                } else {
                    temp += a.charAt(j);
                }
            } else {// 5를 6으로 6을 5로
                if (a.charAt(j) == '5') {
                    temp += '6';
                } else if (a.charAt(j) == '6') {
                    temp += '5';
                } else {
                    temp += a.charAt(j);
                }
            }
        }
        i = Integer.valueOf(temp);
        return i;
    }
}

