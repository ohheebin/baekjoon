import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);

        while(true){
            LinkedList<Integer> arr = new LinkedList<>();
            for(int i = 0; i < 3; i++){
                arr.add(sc.nextInt());
            }
            if(arr.get(0) == 0 && arr.get(1) == 0 && arr.get(2) == 0){
                break;
            }
            Collections.sort(arr);
            Long z = (long)(arr.get(2)*arr.get(2));
            Long x = (long)(arr.get(1)*arr.get(1));
            Long y = (long)(arr.get(0)*arr.get(0));

            if(z == (x + y)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}


