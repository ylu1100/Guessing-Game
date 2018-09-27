package Josorio3438;

import java.util.Scanner;
import java.util.Random;

public class JosorioLib {
    public static void generator(){
        int IN_PROGRESS = 0, WIN = 1;
        int gameStatus = IN_PROGRESS;
        int limit = getLimit();
        int ans = getNum(limit);
        System.out.println("Guess my number! its between 1 and " + limit + ".");
        while(gameStatus == IN_PROGRESS) {
            Scanner guess = new Scanner(System.in);
            int guessMade = guess.nextInt();
            if (guessMade == ans) {
                System.out.println("Yay you got it right!");
                gameStatus = WIN;
            }
            if (guessMade < ans)
                System.out.println("Too low! My guess is higher!");
            if(guessMade > ans)
                System.out.println("Too high! My guess is lower!");
        }
    }


    public static int getNum(int limit){
        Random rand = new Random();
        
        return rand.nextInt(limit)+1;
    }
    public static int getLimit(){
        Scanner choice = new Scanner(System.in);
        System.out.println("Hello! What difficulty do you want to play?" +
                "Type 1 for numbers 1-10" +
                "Type 2 for numbers 1-100" +
                "Type 3 for numbers 1-1000" +
                "Type 4 for numbers 1-10000");
        int idx = 0;
        while(idx != 0) {
            if (choice.nextInt() == 1) {
                idx = 10;
            }
            if (choice.nextInt() == 2) {
                idx = 100;
            }
            if (choice.nextInt() == 3) {
                idx = 1000;
            } else {
                idx = 10000;
            }
        }
        return idx;
    }
}