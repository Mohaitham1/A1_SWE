import java.util.Random;
import java.util.Scanner;

public class Roll_Dice {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        String userChoice;
        String user1Choice;

        System.out.println("========================");
        System.out.println("|Welcome in Dice Roller|");
        System.out.println("========================" + "\n");

        do {

            System.out.println("Choose number:");
            System.out.println("[A|a] roll the dice");
            System.out.println("[B|b] 1 Vs 1");
            System.out.println("[C|c] to exit");
            userChoice = new Scanner(System.in).nextLine();

            if (userChoice.equalsIgnoreCase("A") || userChoice.equalsIgnoreCase("a")) {

                Random random = new Random();
                int diceNum = random.nextInt(6) + 1;
                System.out.println("Dice number:" + diceNum + "\n");

            } else if (userChoice.equalsIgnoreCase("C") || userChoice.equalsIgnoreCase("c")) {

                System.out.print("Closing...");

            } else if (userChoice.equalsIgnoreCase("B") || userChoice.equalsIgnoreCase("b")) {
                do {
                    Random random = new Random();
                    Random random2 = new Random();
                    int playerOneDice = random.nextInt(6) + 1;
                    int playerTwoDice = random2.nextInt(6) + 1;
                    System.out.println("Player one:" + playerOneDice);
                    System.out.println("Player two:" + playerTwoDice + "\n");
                    if (playerOneDice > playerTwoDice) {
                        System.out.println("Player one is winner!" + "\n");
                    } else if (playerOneDice < playerTwoDice) {
                        System.out.println("Player Two is winner!" + "\n");
                    } else {
                        System.out.println("Draw!" + "\n");
                    }

                    System.out.println(
                            "Play again enter [A|a], exit enter [C|c], enter any another character to go to mane manu:");
                    user1Choice = new Scanner(System.in).nextLine();
                    if (user1Choice.equalsIgnoreCase("C") || user1Choice.equalsIgnoreCase("c")) {
                        System.out.print("Closing...");
                        return;
                    }

                } while (user1Choice.equalsIgnoreCase("A") || user1Choice.equalsIgnoreCase("a"));
            } else {

                System.out.println("Your input is wrong!" + "\n");

            }
        } while (!userChoice.equalsIgnoreCase("C") || !userChoice.equalsIgnoreCase("c"));
        return;
    }

}