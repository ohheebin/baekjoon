import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            LinkedList<Integer> arr = new LinkedList<>();
            int sum = 0;
            if(a == -1){
                break;
            }
            for(int i = 1; i < a; i++){
                if(a % i == 0){
                    arr.add(i);
                    sum += i;
                }
            }
            if(sum == a){
                System.out.print(a+" = ");
                while(!arr.isEmpty()){
                    if(arr.size() == 1){
                        System.out.println(arr.poll());
                        break;
                    }
                    System.out.print(arr.pollFirst()+" + ");
                }
            }else{
                System.out.println(a+" is NOT perfect.");
            }
        }
    }
}


