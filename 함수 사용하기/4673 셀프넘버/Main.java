//셀프 넘버

public class Main {
    public static void main(String args[]){
        int[] num = new int[10001];
        int temp;
        for(int i = 1; i <= 10000; i++){
            temp = i;
            while(temp <= 10000){
                if(temp < 10){
                    temp = temp + temp;
                } else if(temp < 100){
                    temp = temp + (temp / 10) + (temp % 10);
                } else if(temp < 1000){
                    temp = temp + (temp / 100) + ((temp % 100) / 10) + (temp % 10);
                } else if(temp <= 10000){
                    temp =  temp + (temp / 1000) + ((temp % 1000) / 100) + (((temp % 1000) % 100) / 10) + (temp % 10);
                }
                if(temp <= 10000){
                    num[temp] = 1;
                }
            }
        }
        for(int j = 1; j <= 10000; j++){
            if(num[j] == 0){
                System.out.println(j);
            }
        }
    }
}
