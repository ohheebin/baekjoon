import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(bw.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        //map을 이용해서 동명이인이 있다면 value를 1 증가 시켜서 다시 저장해준다
        for(int i = 0; i < n; i++){
            String str = bw.readLine();
            if(map.containsKey(str)){
                int num = map.get(str) + 1;
                map.put(str, num);
            }else{
                map.put(str, 1);
            }
        }
        //들어온 선수를 제거할때 동명이인이있다면 value 값을 1 감소 시켜서 다시 저장해준다
        for(int i = 0; i < n-1; i++){
            String str = bw.readLine();
            if(map.get(str) == 1){
                map.remove(str);
            }else{
                int num = map.get(str) - 1;
                map.put(str, num);
            }
        }

        Set key =  map.keySet();
        Iterator iterator = key.iterator();
        String str = (String) iterator.next();

        System.out.println(str);
    }
}







