import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        String check = "";
        for(int i = 0; i < n; i++){
            arr[i] = br.readLine();
        }

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i].length() >= arr[j].length()){
                    if(arr[i].length() == arr[j].length()){
                        if(arr[i].compareTo(arr[j]) >= 0){ // 사전 순으로 이전이면 음수 이후면 양수를 출력
                            String temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }else {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(!check.equals(arr[i])) {
                System.out.println(arr[i]);
            }
            check = arr[i];
        }
    }
}

