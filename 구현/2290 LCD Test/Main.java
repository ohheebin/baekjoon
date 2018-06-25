import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String[] str = bw.readLine().split(" ");
        int n = Integer.valueOf(str[0]);


        int row = 2 * n + 3;

        String[][] result = new String[2*n+3][str[1].length()];
        int size = 0;

        for(int i = 0; i < str[1].length(); i++){
            int num = str[1].charAt(i) - 48;
            String[] list = new String[2*n+3];
            for(int j = 0; j < 2*n+3; j++){
                list[j] = "";
            }
            for(int j = 0; j < row; j++){
                for(int k = 0; k < n+2; k++){
                    if(num == 1){
                        if(k == n + 1 && j != 0 && j != row - 1 && j != row / 2){
                            list[j] += "|";
                        }else{
                            list[j] += " ";
                        }
                    }else if(num == 2){
                        if(j == 0 || j == row - 1 || j == row / 2){
                            if(k > 0 && k < n+1){
                                list[j] += "-";
                            }else{
                                list[j] += " ";
                            }
                        }else if(j < row / 2 && k == n + 1 || j > row / 2 && k == 0){
                            list[j] += "|";
                        }else{
                            list[j] += " ";
                        }
                    }else if(num == 3){
                        if(j == 0 || j == row - 1 || j == row / 2){
                            if(k > 0 && k < n+1){
                                list[j] += "-";
                            }else{
                                list[j] += " ";
                            }
                        }else if(k == n + 1){
                            list[j] += "|";
                        }else{
                            list[j] += " ";
                        }
                    }else if(num == 4){
                        if(j == row / 2 && k != 0 && k != n + 1){
                            list[j] += "-";
                        }else if(j < row / 2 && j > 0){
                            if(k == 0 || k == n +1){
                                list[j] += "|";
                            }else{
                                list[j] += " ";
                            }
                        }else if(j > row / 2 && j < row - 1){
                            if(k == n + 1){
                                list[j] += "|";
                            }else{
                                list[j] += " ";
                            }
                        } else{
                            list[j] += " ";
                        }
                    }else if(num == 5){
                        if(j == 0 || j == row - 1 || j == row / 2){
                            if(k > 0 && k < n+1){
                                list[j] += "-";
                            }else{
                                list[j] += " ";
                            }
                        }else if(j < row / 2 && k == 0 || j > row / 2 && k == n + 1){
                            list[j] += "|";
                        }else{
                            list[j] += " ";
                        }
                    }else if(num == 6){
                        if(j == 0 || j == row - 1 || j == row / 2){
                            if(k > 0 && k < n+1){
                                list[j] += "-";
                            }else{
                                list[j] += " ";
                            }
                        }else if(j < row / 2){
                            if(k == 0) {
                                list[j] += "|";
                            }else{
                                list[j] += " ";
                            }
                        }else if(j > row / 2){
                            if(k == 0 || k == n + 1){
                                list[j] += "|";
                            }else{
                                list[j] += " ";
                            }
                        }else{
                            list[j] += " ";
                        }
                    }else if(num == 7){
                        if(j == 0){
                            if(k > 0 && k < n+1){
                                list[j] += "-";
                            }else{
                                list[j] += " ";
                            }
                        }else if(j < row / 2 || j > row / 2 && j != row - 1){
                            if(k == n + 1){
                                list[j] += "|";
                            }else{
                                list[j] += " ";
                            }
                        }else{
                            list[j] += " ";
                        }
                    }else if(num == 8){
                        if(j == 0 || j == row - 1 || j == row / 2){
                            if(k > 0 && k < n+1){
                                list[j] += "-";
                            }else{
                                list[j] += " ";
                            }
                        }else if(j < row / 2 || j > row / 2){
                            if(k == 0 || k == n + 1) {
                                list[j] += "|";
                            }else{
                                list[j] += " ";
                            }
                        }else{
                            list[j] += " ";
                        }
                    }else if(num == 9){
                        if(j == 0 || j == row - 1 || j == row / 2){
                            if(k > 0 && k < n+1){
                                list[j] += "-";
                            }else{
                                list[j] += " ";
                            }
                        }else if(j > row / 2){
                            if(k == n + 1) {
                                list[j] += "|";
                            }else{
                                list[j] += " ";
                            }
                        }else if(j < row / 2){
                            if(k == 0 || k == n + 1){
                                list[j] += "|";
                            }else{
                                list[j] += " ";
                            }
                        }else{
                            list[j] += " ";
                        }
                    }else{
                        if(j == 0 || j == row - 1){
                            if(k > 0 && k < n+1){
                                list[j] += "-";
                            }else{
                                list[j] += " ";
                            }
                        }else if(j < row / 2 || j > row / 2 && j != row / 2){
                            if(k == 0 || k == n + 1) {
                                list[j] += "|";
                            }else{
                                list[j] += " ";
                            }
                        }else{
                            list[j] += " ";
                        }
                    }
                }
                list[j] += " ";
                result[j][size] = list[j];
            }
            size += 1;
        }
        int last = str[1].length();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < last; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}


