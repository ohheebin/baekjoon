import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(bw.readLine());

        for(int i = 0; i < n; i++){
            String[] arr = new String[101];
            int num = 0;
            int size = 0;
            while(true){
                String str = bw.readLine();
                if(str.equals("what does the fox say?")){
                    for(int j = 0; j < size; j++){
                        if(!arr[j].equals("")){
                            System.out.print(arr[j]+" ");
                        }
                    }
                    System.out.println();
                    break;
                }

                if(num == 0){
                    arr = str.split(" ");
                    size = arr.length;
                    num++;
                }else{
                    String[] check = str.split(" ");
                    for(int j = 0; j < arr.length; j++){
                        if(check[2].equals(arr[j])){
                            arr[j] = "";
                        }
                    }
                }
            }
        }
    }
}







