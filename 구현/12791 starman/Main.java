import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int[] year = {1967, 1969, 1970, 1971, 1972, 1973, 1973, 1974, 1975, 1976, 1977,
        1977, 1979, 1980, 1983, 1984, 1987, 1993, 1995, 1997, 1999, 2002, 2003, 2013, 2016};

        String[] book = {"DavidBowie", "SpaceOddity", "TheManWhoSoldTheWorld", "HunkyDory", "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars", "AladdinSane",
                "PinUps", "DiamondDogs", "YoungAmericans", "StationToStation", "Low", "Heroes", "Lodger", "ScaryMonstersAndSuperCreeps",
        "LetsDance", "Tonight", "NeverLetMeDown", "BlackTieWhiteNoise", "1.Outside", "Earthling", "Hours", "Heathen", "Reality",
        "TheNextDay", "BlackStar"};

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int count = 0;
            int min = 26;
            int max = 0;
            for(int j = 0; j < 25; j++){
                if(year[j] >= start && year[j] <= end){
                    count++;
                    if(j > max){
                        max = j;
                    }
                    if(j < min){
                        min = j;
                    }
                }
            }
            System.out.println(count);
            for (int j = min; j <= max; j++) {
                System.out.println(year[j] + " " + book[j]);
            }
        }
    }
}


