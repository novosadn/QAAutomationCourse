import java.util.Scanner;

class Executor {
    void executor(){

        NameNumber nameNumber = new NameNumber();
        TenNumbersArray tenNumbersArray = new TenNumbersArray();
        TwentyNumbersArray twentyNumbersArray = new TwentyNumbersArray();

        System.out.print("Hi! Please enter number of the program You would like to launch: 1 - Name&Number, 2 - Ten Numbers Array, 3 - Twenty Numbers Array: ");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        if (n == 1) nameNumber.nameNumber();
        else if (n == 2) {
            tenNumbersArray.arrayReader();
            tenNumbersArray.arrayPrinter();
        }  else if (n == 3) {
            twentyNumbersArray.arrayReader();
            twentyNumbersArray.arrayPrinter();
        }
        else System.out.println("Please, make correct choice.");
    }
}
