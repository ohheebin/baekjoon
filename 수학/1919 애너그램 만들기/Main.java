import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        //a와 b를 각각 한글자씩 list에 저장한다
        LinkedList<Character> arr_a = new LinkedList<>();
        LinkedList<Character> arr_b = new LinkedList<>();

        for(int i = 0; i < a.length(); i++){
            arr_a.add(a.charAt(i));
        }

        for(int j = 0; j < b.length(); j++){
            arr_b.add(b.charAt(j));
        }

        int count = arr_a.size() + arr_b.size();
        //같은 것이 있으면 arr_b에 있는 글자를 지우고 count를 2개 줄인다.
        for(int i = 0; i < arr_a.size(); i++){
            for(int j = 0; j < arr_b.size(); j++){
                if(arr_a.get(i).equals(arr_b.get(j))){
                    arr_b.remove(j);
                    count -= 2;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}


