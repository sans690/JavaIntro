// Name:e.g. Saniyah Smith
// Computing ID:e.g. xjk8nm@hogwarts.edu
// Homework Name:e.g. JavaIntro
// Resources used (if applicable) ChatGPT(full citation at the bottom)

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaIntro {

    public static void main(String[] args) {
        /// prints statement
        System.out.println("Welcome to the game!");
        // takes in input from the user, new instance
        Scanner input = new Scanner(System.in);
        // string array that holds different words
        String[] optionalChoices = { "rock", "paper", "scissors", "lizard", "spock" };
        // prints statement with array list items
        System.out.println("These are the options" + Arrays.toString(optionalChoices) + ".");
        System.out.println("What is your choice?");
        // string userMove equal the input of the next line
        String userMove = input.nextLine();
        // string computerMoves equals new random instance that is an int that within
        // the length of the OC
        String computerMove = optionalChoices[new Random().nextInt(optionalChoices.length)];
        System.out.println("The computer picked " + computerMove + ".");
        int result = rpsls(userMove, computerMove);
        System.out.println("rpsls: (\"" + userMove + "\", \"" + computerMove + "\") " + result);
        int target = 50;
        int max = 100;
        int min = 0;
        // takes input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like for your input?");
        // scans for the next int entered
        int inputX = scan.nextInt();
        // setting a variable to the inputX(kinda not needed)
        int input2 = inputX;
        System.out.println("You typed in " + input2 + " as your number.");
        int one = 3;
        int two = 5;
        // calling the method
        fuzzbizz(one, two, input2);
        int[] arr1 = { 1, 2, 2, 3, 4, 4 };
        int[] arr2 = { 1, 1, 2, 1, 1 };
        int[] arr3 = { 1, 1, 1, 1, 1 };
        int count1 = countRuns(arr1);
        int count2 = countRuns(arr2);
        int count3 = countRuns(arr3);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);

        while (true)

        {
            // calling the method
            int num = hilo(max, target, min);
            //
            if (num > target) {
                System.out.println("The number is too high!");
                max = num - 1;
            } else if (num < target) {
                System.out.println("The number is too low!");
                min = num + 1;
            }

            else {
                System.out.println("You found the number!");

                break;

            }
        }
    }

    public static int hilo(int max, int target, int min) {
        // randNum equals another instance of Random
        Random randNum = new Random();
        // randNumGenerated is equal to the number generated between the two numbers
        int num = randNum.nextInt((max - min) + 1) + min;
        System.out.println("Number generated: " + num);
        // returns value back to caller
        return num;
    }

    public static int rpsls(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return 0; // It's a draw
            // else if the userChoice equals rock and the computerfChoice equals scissors or
            // the computerChoice equals lizard
        } else if ((userChoice.equals("rock") && (computerChoice.equals("scissors") || computerChoice.equals("lizard")))
                ||
                (userChoice.equals("paper") && (computerChoice.equals("rock") || computerChoice.equals("spock"))) ||
                (userChoice.equals("scissors") && (computerChoice.equals("paper") || computerChoice.equals("lizard")))
                ||
                (userChoice.equals("lizard") && (computerChoice.equals("spock") || computerChoice.equals("paper"))) ||
                (userChoice.equals("spock") && (computerChoice.equals("scissors") || computerChoice.equals("rock")))) {
            return 1; // You win
        } else {
            return -1; // Computer wins
        }
    }

    public static String fuzzbizz(int one, int two, int input2) {
        System.out.println("fuzzbizz" + "( " + one + ", " + two + ", " + input2 + " )");

        if (input2 % one == 0 && input2 % two == 0) {
            System.out.println("fuzzbizz");
            return "fuzzbizz";
        }

        else if (input2 % one == 0) {
            System.out.println("fuzz");
            return "fuzz";
        }

        else if (input2 % two == 0) {
            System.out.println("bizz");
            return "bizz";
        }

        else {
            System.out.println("none");
            return "none";
        }
    }

    public static int countRuns(int[] numbers) {
        // checks if number is empty or numbers length equals 0
        if (numbers == null || numbers.length == 0)

            return 0;

        int runCount = 0;
        int currentRun = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1])

                currentRun++;

            else {
                if (currentRun >= 2) {
                    runCount++;
                }

                currentRun = 1;
            }
        }

        if (currentRun >= 2) {
            runCount++;
        }
        return runCount;
    }
}
// Method 4: Credit to ChatGPT for fixing the order of brackets and helping with
// method
// placement“ Text of prompt” prompt. ChatGPT, Day Month version, OpenAI, Sep 9
// 2023, chat.openai.com.

// Method 1: Credit to ChatGPT for fixing the order of brackets and helping with
// randNumGenerated for taking the range“ Text of prompt” prompt. ChatGPT, Day
// Month version, OpenAI, Sep 9 2023, chat.openai.com.

// Method 2: Credit to ChatGPT for simplfied version of my code that impliments
// correct
// method header“ Text of prompt” prompt. ChatGPT, Day Month version, OpenAI,
// Sep 9 2023, chat.openai.com.
// Orignal code (Working and follows all rules, just very long):

/*
 * import java.util.Arrays;
 * import java.util.Random;
 * import java.util.Scanner;
 * 
 * public class JavaIntro {
 * // Method 2
 * public static void main(String[] args) {
 * // boolean gameStatus = true;
 * // while (gameStatus) {
 * System.out.println("Welcome to the game!");
 * // defined scanner util from java, input now is a new instance of that method
 * Scanner input = new Scanner(System.in);
 * String[] optionalChoices = { "rock", "paper", "scissors", "lizard", "spock"};
 * System.out.println("These are the options" + Arrays.toString(optionalChoices)
 * + ".");
 * System.out.println("What is your choice?");
 * // looks for userinput based on next line and prints it
 * String userMove = input.nextLine();
 * String computerMove = optionalChoices[new
 * Random(6).nextInt(optionalChoices.length)];
 * // Computer moves
 * // random int that will represent a move, int goes from 0- defined num (6)
 * Random random = new Random();
 * int computerMoveNum = random.nextInt(5);
 * if(computerMoveNum == 1){ computerMove = "rock";
 * System.out.println("The computer picked rock.");
 * }
 * else if(computerMoveNum == 2){ computerMove = "paper";
 * System.out.println("The computer picked paper.");
 * }
 * else if(computerMoveNum == 3){ computerMove = "scissors";
 * System.out.println("The computer picked scissors.");
 * }
 * else if(computerMoveNum == 4){ computerMove = "lizard";
 * System.out.println("The computer picked lizard.");
 * }
 * else if(computerMoveNum == 5){ computerMove = "spock";
 * System.out.println("The computer picked spock.");
 * }
 * // if draw
 * if(userMove.equals(computerMove)){
 * System.out.println("It's a draw!");
 * boolean draw = true;
 * if(draw){ int result = -1;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * // if not ___, then userMove = rock
 * else if(userMove.equals("rock")){
 * if(computerMove.equals("paper")){
 * System.out.println("Paper covers rock, you lose!");
 * boolean lose = true;
 * if(lose){ int result = 0;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if(computerMove.equals("scissors")){
 * System.out.println("Rock breaks scissors, you win!");
 * boolean win = true;
 * if(win){ int result = 1;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if (computerMove.equals("lizard")) {
 * System.out.println("Rock crushes lizard, you win!");
 * boolean win = true;
 * if(win){ int result = 1;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if(computerMove.equals("spock")) {
 * System.out.println("Spock vaporizes rock, you lose!");
 * boolean lose = true;
 * if(lose){ int result = 0;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * }
 * // if not ___, then userMove = paper
 * else if(userMove.equals("paper")){
 * if(computerMove.equals("scissors")){
 * System.out.println("Scissors cuts paper, you lose!");
 * boolean lose = true;
 * if(lose){ int result = 0;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if (computerMove.equals("rock")) {
 * System.out.println("Paper covers rock, you win!");
 * boolean win = true;
 * if(win){ int result = 1;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if (computerMove.equals("lizard")) {
 * System.out.println("Lizard eats paper, you lose!");
 * boolean lose = true;
 * if(lose){ int result = 0;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if(computerMove.equals("spock")){
 * System.out.println("Paper disaproves spock, you win!");
 * boolean win = true;
 * if(win){ int result = 1;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * }
 * // if not ___, then userMove = scissors
 * else if(userMove.equals("scissors")){
 * if (computerMove.equals("paper")) {
 * System.out.println("Scissors cuts paper, you win!");
 * boolean win = true;
 * if(win){ int result = 1;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if(computerMove.equals("lizard")){
 * System.out.println("Scissors decapitate lizard, you win!");
 * boolean win = true;
 * if(win){ int result = 1;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if(computerMove.equals("rock")){
 * System.out.println("Rock breaks scissors, you lose!");
 * boolean lose = true;
 * if(lose){ int result = 0;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if(computerMove.equals("spock")){
 * System.out.println("Spock melts scissors, you lose!");
 * boolean lose = true;
 * if(lose){ int result = 0;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * }
 * // if not ___, then userMove = lizard
 * else if (userMove.equals("lizard")){
 * if(computerMove.equals("scissors")){
 * System.out.println("Scissors decapitates lizard, you lose!");
 * boolean lose = true;
 * if(lose){ int result = 0;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if (computerMove.equals("paper")) {
 * System.out.println("Lizard eats paper, you win!");
 * boolean win = true;
 * if(win){ int result = 1;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if (computerMove.equals("rock")) {
 * System.out.println("Rock crushes lizard, you lose!");
 * boolean lose = true;
 * if(lose){ int result = 0;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if (computerMove.equals("spock")) {
 * System.out.println("Lizard poisons spock, you win!");
 * boolean win = true;
 * if(win){ int result = 1;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * }
 * // if not __, then userMove = spock
 * else if (userMove.equals("spock")) {
 * if(computerMove.equals("lizard")){
 * System.out.println("Lizard poisons spock, you lose!");
 * boolean lose = true;
 * if(lose){ int result = 0;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if (computerMove.equals("scissors")) {
 * System.out.println("Spock melts scissors, you win!");
 * boolean win= true;
 * if(win){ int result = 1;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if (computerMove.equals("rock")) {
 * System.out.println("Spock vaporizes rock, you win!");
 * boolean win = true;
 * if(win){ int result = 1;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * else if (computerMove.equals("paper")) {
 * System.out.println("Paper disaproves spock, you lose!");
 * boolean lose = true;
 * if(lose){ int result = 0;
 * System.out.println( "rpsls: " + "( " + "\"" + userMove + "\"" + " , " + "\""
 * + computerMove + "\"" + " ) " + result);}
 * }
 * }
 * }
 * }
 */
