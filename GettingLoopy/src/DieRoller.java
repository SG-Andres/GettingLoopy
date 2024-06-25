import java.util.Random;
import java.util.Scanner;
public class DieRoller {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean again = true;

        while (again) {
                int die1 = random.nextInt(6)+1;
                int die2 = random.nextInt(6)+1;
                int die3 = random.nextInt(6)+1;
                int sum = die1 + die2 + die3;
            for (int x = 1; x <= 1; x++) {
                System.out.printf("Dice roll one: %d, Dice roll two: %d, Dice roll three %d, Sum of all dice: %d", die1, die2, die3, sum);}
                System.out.println();
                if (die1 == die2 && die1 == die3) {
                    System.out.println("All dice are equal");
                    again = false;
                } else {
                    System.out.println("Do you want to roll again?");
                    String yn = scanner.nextLine().trim();

                    if (yn.equals("y")) {
                        again = true;
                    } else if (yn.equals("n")) {
                        again = false;
                    }
                }
                }


        }


        }