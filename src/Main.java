import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java dice roller program
        printLogo();
        // declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice = 0;
        int total = 0;

        // get the num of dice from the user
        System.out.println("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();
        // check if num of dice is > then 0
        if (numOfDice <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled a " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }

        // display ascii of dice


        scanner.close();
    }

    static void printDie(int roll) {
        switch (roll) {
            case 1 -> System.out.println(
                            "┌─────────┐\n" +
                            "│         │\n" +
                            "│    ●    │\n" +
                            "│         │\n" +
                            "└─────────┘"
            );
            case 2 -> System.out.println(
                            "┌─────────┐\n" +
                            "│ ●       │\n" +
                            "│         │\n" +
                            "│       ● │\n" +
                            "└─────────┘"
            );
            case 3 -> System.out.println(
                            "┌─────────┐\n" +
                            "│ ●       │\n" +
                            "│    ●    │\n" +
                            "│       ● │\n" +
                            "└─────────┘"
            );
            case 4 -> System.out.println(
                            "┌─────────┐\n" +
                            "│ ●     ● │\n" +
                            "│         │\n" +
                            "│ ●     ● │\n" +
                            "└─────────┘"
            );
            case 5 -> System.out.println(
                            "┌─────────┐\n" +
                            "│ ●     ● │\n" +
                            "│    ●    │\n" +
                            "│ ●     ● │\n" +
                            "└─────────┘"
            );
            case 6 -> System.out.println(
                            "┌─────────┐\n" +
                            "│ ●     ● │\n" +
                            "│ ●     ● │\n" +
                            "│ ●     ● │\n" +
                            "└─────────┘"
            );
            default -> System.out.println("Invalid roll: " + roll);
        }
    }

    static void printLogo(){
        System.out.println("    ____  ____  ____  _____   ____  ____  ____  __    ____  __  ___ ");
        System.out.println("   / __ \\/ __ \\/ __ \\/ ___/  / __ \\/ __ \\/ __ \\/ /   / __ \\/ / / (_)");
        System.out.println("  / / / / / / / / / /\\__ \\  / /_/ / / / / / / / /   / / / / /_/ / / ");
        System.out.println(" / /_/ / /_/ / /_/ /___/ / / _, _/ /_/ / /_/ / /___/ /_/ / __  / /  ");
        System.out.println("/_____/\\____/\\____//____/ /_/ |_|\\____/\\____/_____/\\____/_/ /_/_/   ");
        System.out.println();
        System.out.println("        ┌─────────┐     ┌─────────┐");
        System.out.println("        │ ●     ● │     │ ●     ● │");
        System.out.println("        │    ●    │     │ ●     ● │");
        System.out.println("        │ ●     ● │     │ ●     ● │");
        System.out.println("        └─────────┘     └─────────┘");
        System.out.println();
        System.out.println("         🎲  Press ENTER to start rolling!  🎲");
    }
}
