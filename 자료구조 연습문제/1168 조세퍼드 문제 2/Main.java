import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        LinkedList<Integer> arr = new LinkedList<>();
        LinkedList<Integer> dp = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            arr.add(i);
        }
        int num = 0;


        while(!arr.isEmpty()){
            num += m - 1;
            if(num >= arr.size()){
                while(num >= arr.size()) {
                    num -= arr.size();
                }
            }
            dp.add(arr.remove(num));
        }
        System.out.print("<");
        while(!dp.isEmpty()){
            if(dp.size() != 1) {
                System.out.print(dp.poll() + ", ");
            }else{
                System.out.print(dp.poll()+">");
            }
        }
    }
}


