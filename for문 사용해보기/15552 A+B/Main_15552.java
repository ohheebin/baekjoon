/**
 * Created by heebin on 2018. 5. 9..
 */
import java.io.*;
public class Main_15552 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            String a = "";
            String b = "";

            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == ' '){
                    for(int k = j+1; k < str.length(); k++){
                        b += str.charAt(k);
                    }
                    break;
                }
                a += str.charAt(j);
            }

            int c = Integer.parseInt(a) + Integer.parseInt(b);
            wr.write(String.valueOf(c));
            wr.newLine();

        }
        wr.flush();
        br.close();
        wr.close();
    }
}
