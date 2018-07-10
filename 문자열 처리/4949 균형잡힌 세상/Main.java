import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while(true){
            String str = bw.readLine();
            LinkedList<Character> list = new LinkedList<>();


            if(str.equals(".")){
                break;
            }
            String result = "yes";
            for(int i = 0; i < str.length(); i++){
                //왼쪽 소괄호와 대괄호를 만나면 list에 넣는다
                if(str.charAt(i) == '('){
                    list.add('(');
                }else if(str.charAt(i) == ')'){ //오른쪽 소괄호가 나온경우 list가 비어있거나 마지막list가 [ 인 경우 no
                    if(list.isEmpty()){
                        result = "no";
                        break;
                    }else if(list.getLast() == '['){
                        result = "no";
                        break;
                    }else{ //( 인 경우는 list에서 삭제한다
                        list.pollLast();
                    }
                }else if(str.charAt(i) == '['){
                    list.add('[');
                }else if(str.charAt(i) == ']'){ //오른쪽 대괄호가 나온경우 list가 비어있거나 마지막list가 ( 인 경우 no
                    if(list.isEmpty()){
                        result = "no";
                        break;
                    }else if(list.getLast() == '('){
                        result = "no";
                        break;
                    }else{ // [ 인 경우는 list에서 삭제한다
                        list.pollLast();
                    }
                }
            }
            if(!list.isEmpty()){ //list가 비어있지 않다면 no
                result = "no";
            }

            System.out.println(result);
        }
    }
}







