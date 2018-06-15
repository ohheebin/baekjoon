import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(date.format(today));


    }
}


