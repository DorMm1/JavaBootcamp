package TestLearning;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
        // EX 1:
        GameMap gm = new GameMap();
        Player gamer = new Player(gm);
        Scanner scanner = new Scanner(System.in);
        char key;
        System.out.println("STARTING A NEW GAME!!");
        gm.printMap();
        while(!gamer.gameStatus()){
            System.out.println("Insert a key to play:");
            key = scanner.nextLine().charAt(0);
            gamer.play(key);
        //EX 2:
       Random rnd = new Random();
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
        }



}
