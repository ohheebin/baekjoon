import java.util.Scanner;

public class Main_2935 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String op = sc.nextLine();
        String B = sc.nextLine();

        int A_len = A.length();
        int B_len = B.length();

        if(op.equals("*")){
            System.out.print(A);
            for(int i = 1; i < B_len; i++){
                System.out.print(B.charAt(i));
            }
        }else{
            if(A_len > B_len){
                for(int i = 0; i < A_len; i++){
                    if(i == (A_len - B_len)){
                        System.out.print(B.charAt(0));
                    }else{
                        System.out.print(A.charAt(i));
                    }
                }
            }else if(B_len > A_len){
                for(int i = 0; i < B_len; i++){
                    if(i == (B_len - A_len)){
                        System.out.print(A.charAt(0));
                    }else{
                        System.out.print(B.charAt(i));
                    }
                }
            }else{
                System.out.print("2");
                for(int i = 1; i < B_len; i++){
                    System.out.print("0");
                }
            }
        }
    }
}
