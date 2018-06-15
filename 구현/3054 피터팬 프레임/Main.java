import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = 5 * str.length() - (str.length() - 1);
        int ch = 0;
        int y = 0;

        for(int i = 1; i <= 5; i++){
            int num = 3;
            boolean check = false;
            int x = 2;
            int z = str.length() / 3;
            int k = 8;
            for(int j = 1; j <= n; j++){
                if(k == 0 && z != 0){
                    check = true;
                    ch = 5;
                    z--;
                }
                if(i == 1 || i == 5){
                    if(check == true){
                        if(x == 0){
                            x = 3;
                            System.out.print("*");
                        }else{
                            System.out.print(".");
                            x--;
                        }
                        ch--;
                    }else{
                        if(x == 0){
                            x = 3;
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                            x--;
                        }
                    }
                }else if(i == 3){
                    if(check == true){
                        if(j % 2 == 1){
                            if(x == 0) {
                                System.out.print(str.charAt(y));
                                y++;
                                x = 4;
                            }else{
                                System.out.print("*");
                            }
                        }else{
                            System.out.print(".");
                        }
                        ch--;
                    }else{
                        if(j % 2 == 1){
                            if(x == 0){
                                System.out.print(str.charAt(y));
                                y++;
                                x = 4;
                            }else{
                                System.out.print("#");
                            }
                        }else{
                            System.out.print(".");
                        }
                        ch--;
                    }
                    x--;
                }else if(i == 2 || i == 4){
                    if(check == true){
                        if(j % 2 == 1){
                            System.out.print(".");
                        }else{
                            System.out.print("*");
                        }
                        ch--;
                    }else{
                        if(j % 2 == 1){
                            System.out.print(".");
                        }else{
                            System.out.print("#");
                        }
                        ch--;
                    }
                }
                k--;
                if(ch == 0 && check == true){
                    check = false;
                    k = 7;
                }
            }
            System.out.println();
        }
    }
}


