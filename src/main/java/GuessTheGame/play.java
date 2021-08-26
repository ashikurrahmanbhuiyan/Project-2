package GuessTheGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class throwsfile{
         String fun() throws FileNotFoundException {
    File file = new File("C:\\Users\\Asus\\Project-2\\src\\main\\resources\\movies.txt");
    Scanner sc = new Scanner(file);
    String movies = sc.nextLine();
    return movies;
}
        }
public class play {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            throwsfile obj = new throwsfile();
            String movies = obj.fun();
            String[] Movies = movies.split(" ");
            int win = 0;
            int wrongCheak = 0;
            int w = 0;
            int pick = (int) (Math.random() * 3.0);
            String pickedMovie = Movies[pick];
            int numOfUnderscore = (pickedMovie.length());
            char[] underScore = new char[numOfUnderscore];
            String wrongGuess = "";// = new char[10];
            for (int i = 0; i < numOfUnderscore; i++) {
                underScore[i] = '_';
            }

            System.out.print("you are guessing: ");
            System.out.println(underScore);
            System.out.println("you have guess (0) wrong letters:");
            for (int j = 0; j < 10; j++) {
                Scanner inputCha = new Scanner(System.in);
                System.out.println(" ");
                System.out.print("Enter a guess: ");
                char guess = inputCha.next().charAt(0);
                for (int i = 0; i < numOfUnderscore; i++) {
                    if (pickedMovie.charAt(i) == guess && underScore[i] == '_') {
                        underScore[i] = guess;
                        win++;
                        break;
                    } else {
                        wrongCheak++;
                    }
                }
                System.out.print("you are guessing: ");
                if (wrongCheak == numOfUnderscore) {
                    wrongGuess = wrongGuess + guess;
                    w++;
                    System.out.println("you have guessed (" + w + ") wrong numbers : " + wrongGuess);
                    wrongCheak = 0;
                }
                System.out.println(underScore);
                if (win == numOfUnderscore) {
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("you win");
                    break;
                }
            }
            if (win != numOfUnderscore) {
                System.out.println(" ");
                System.out.println("your are a loser");
            }
        }




        catch (FileNotFoundException e) {

            String[] Movies = {"matrix","ironman","thappad","kick","race","message","bala","source","mirror"};
            int win = 0;
            int wrongCheak = 0;
            int w = 0;
            int pick = (int) (Math.random() * 3.0);
            String pickedMovie = Movies[pick];
            int numOfUnderscore = (pickedMovie.length());
            char[] underScore = new char[numOfUnderscore];
            String wrongGuess = "";// = new char[10];
            for (int i = 0; i < numOfUnderscore; i++) {
                underScore[i] = '_';
            }

            System.out.print("you are guessing: ");
            System.out.println(underScore);
            System.out.println("you have guess (0) wrong letters:");
            for (int j = 0; j < 10; j++) {
                Scanner inputCha = new Scanner(System.in);
                System.out.println(" ");
                System.out.print("Enter a guess: ");
                char guess = inputCha.next().charAt(0);
                for (int i = 0; i < numOfUnderscore; i++) {
                    if (pickedMovie.charAt(i) == guess && underScore[i] == '_') {
                        underScore[i] = guess;
                        win++;
                        break;
                    } else {
                        wrongCheak++;
                    }
                }
                System.out.print("you are guessing: ");
                if (wrongCheak == numOfUnderscore) {
                    wrongGuess = wrongGuess + guess;
                    w++;
                    System.out.println("you have guessed (" + w + ") wrong numbers : " + wrongGuess);
                    wrongCheak = 0;
                }
                System.out.println(underScore);
                if (win == numOfUnderscore) {
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("you win");
                    break;
                }
            }
            if (win != numOfUnderscore) {
                System.out.println(" ");
                System.out.println("your are a loser");
            }
        }
    }
}
