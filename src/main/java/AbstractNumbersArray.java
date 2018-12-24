import java.util.Scanner;

abstract class AbstractNumbersArray {

    abstract int getLen();
    int[] inputNumbers;

    void arrayReader() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[getLen()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();
        }
        inputNumbers = numbers;
    }
}