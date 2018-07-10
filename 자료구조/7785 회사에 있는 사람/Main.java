import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));

        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(br.readLine());

        Set<String> list = new HashSet<>(); // set을 이용하여 이름을 저장한다
        for(int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");

            if(str[1].equals("leave")){
                list.remove(str[0]);
            }else{
                list.add(str[0]);
            }
        }

        String[] arr = list.toArray(new String[list.size()]); // 정렬하기 위해 array를 만든다
        Arrays.sort(arr);

        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}

