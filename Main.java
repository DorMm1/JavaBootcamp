package TestLearning;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static boolean counting = true;
    public static void main(String[] args) {
        /*GameMap gm = new GameMap();
        Player gamer = new Player(gm);
        Scanner scanner = new Scanner(System.in);
        char key;
        System.out.println("STARTING A NEW GAME!!");
        gm.printMap();
        while(!gamer.gameStatus()){
            System.out.println("Insert a key to play:");
            key = scanner.nextLine().charAt(0);
            gamer.play(key);
        }*/
/*        Random rnd = new Random();
        String[] listOfWords = {"java","jjava","vaj","aavj","j","vjaa","dan","and","ddan"};
        int[][] count = new int[listOfWords.length][2];
        for(int i=0;i<listOfWords.length;i++){
            for(int j=0;j<listOfWords[i].length();j++){
                char character = listOfWords[i].charAt(j);
                count[i][0] += (int) character;
            }
        }
        for(int i=0; i<listOfWords.length;i++){
            for(int j=0; j<listOfWords.length-1;j++){
                if(count[i][0] == count[j][0]) {
                    count[i][1]++;
                    if (i != j) { // mixing the ascii values after incrementing
                        count[j][0] = rnd.nextInt(10000) * -1;
                        count[j][1] = count[j][0];
                    }
                }
            }
        }
        for(int i=0; i<listOfWords.length;i++){
            if(count[i][1]>0){
                System.out.println("The word "+listOfWords[i]+" repeats "+
                        (count[i][1])+" times");
            }
        }*/

        System.out.println("Press enter to stop counting");
        Thread counter = new Thread(new ThreadCountFile());
//        Thread stopper = new Thread(new ThreadStopCountFile()); // tried adding a stopper thread but not working
        counter.start();
//        stopper.start();
        try {
            Thread.sleep(MAX_VALUE);
            if(!counting) // counting is a static boolean var on the Main class
                Thread.currentThread().interrupt();
        } catch (InterruptedException e) {
            System.out.println("Counting finished, we reached:" + ThreadCountFile.count);
        }
    }

}
