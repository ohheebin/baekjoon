import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();

        int a = num(first) * 10;
        int b = num(second);
        int c = num(third);

        long result = a + b;

        for(int i = 0; i < c; i++){
            result *= 10;
        }

        System.out.println(result);

    }

    private static int num(String a){
        int i = 0;
        switch (a){
            case "black":
                i = 0;
                break;
            case "brown":
                i = 1;
                break;
            case "red" :
                i = 2;
                break;
            case "orange":
                i = 3;
                break;
            case "yellow":
                i = 4;
                break;
            case "green":
                i = 5;
                break;
            case "blue":
                i = 6;
                break;
            case "violet":
                i = 7;
                break;
            case "grey":
                i = 8;
                break;
            default:
                i = 9;
                break;
        }
        return i;
    }

}

