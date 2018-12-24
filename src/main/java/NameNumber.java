import java.util.Scanner;

import static java.lang.System.in;

class NameNumber {

    void nameNumber() {
        System.out.print("Please, enter number of the player and his name: ");
        Scanner reader = new Scanner(in);
        int number = reader.nextInt();
        String name = reader.next();
        System.out.println("Player " + name + " wears number " + number + " on his T-shirt.");
    }
}