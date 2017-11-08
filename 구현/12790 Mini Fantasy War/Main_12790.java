/**
 * Created by heebin on 2017. 10. 6..
 */
import java.util.*;
public class Main_12790 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] list = new int[num][8];


        for(int i = 0; i < num; i++){
            for(int j = 0; j < 8; j++){
                list[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < num; i++){
            int stat = 0;
            int HP = 0;
            int MP = 0;
            int attack = 0;
            int defence = 0;

            HP = list[i][0] + list[i][4];
            if(HP < 1){
                HP = 1;
            }

            MP = list[i][1] + list[i][5];
            if(MP < 1){
                MP = 1;
            }

            attack = list[i][2] + list[i][6];
            if(attack < 0){
                attack = 0;
            }

            defence = list[i][3] + list[i][7];

            stat = HP + (5 * MP) + (2 * attack) + (2 * defence);

            System.out.println(stat);
        }

    }
}
