import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(bw.readLine());

        long[] arr = new long[n];
        long max = 0;
        for(int i = 0; i < n; i++){
            long k = Long.valueOf(bw.readLine());
            arr[i] = k;
        }
        //quick sort 를 통해 오름차순으로 정렬을 시켜준다.
        quickSort(arr, 0, n-1);
        
    }

    private static void quickSort(long[] a, int low, int high){
        if (low < high){
            int pivot = partition(a , low, high);
            quickSort(a, low, pivot-1);
            quickSort(a, pivot+1, high);
        }
    }

    private static int partition(long[] a, int pivot, int high){
        int i = pivot + 1;
        int j = high;
        while(true){
            while(i < high && a[i] < a[pivot]){
                i++;
            }
            while(j > pivot && a[j] > a[pivot]){
                j--;
            }
            if(j <= i){
                break;
            }
            long temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        long temp = a[pivot];
        a[pivot] = a[j];
        a[j] = temp;
        return j;
    }
}

