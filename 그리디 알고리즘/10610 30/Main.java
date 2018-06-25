import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String str = bw.readLine();
        int[] arr = new int[str.length()];
        long sum = 0;

        for(int i = 0; i < str.length(); i++){
            arr[i] = (int)str.charAt(i) - 48;
            sum += arr[i];

        }
        //내림차순으로 정렬한다 30의 배수의 최대값은 내림차순으로 정렬한 것
        quickSort(arr, 0, str.length() - 1);

        //30의 배수가 되기위한 조건은 0이 1개 이상 나오고 각 자리수의 합이 3으로 나누어 떨어지는 경우
        if(arr[str.length()-1] == 0 && sum % 3 == 0){
            for(int i = 0; i < str.length(); i++){
                System.out.print(arr[i]);
            }
        }else{
            System.out.println(-1);
        }


    }

    private static void quickSort(int[] a, int low, int high){
        if (low < high){
            int pivot = partition(a , low, high);
            quickSort(a, low, pivot-1);
            quickSort(a, pivot+1, high);
        }
    }

    private static int partition(int[] a, int pivot, int high){
        int i = pivot + 1;
        int j = high;
        while(true){
            while(i < high && a[i] > a[pivot]){
                i++;
            }
            while(j > pivot && a[j] < a[pivot]){
                j--;
            }
            if(j <= i){
                break;
            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        int temp = a[pivot];
        a[pivot] = a[j];
        a[j] = temp;
        return j;
    }

}

