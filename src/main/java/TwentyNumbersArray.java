class TwentyNumbersArray extends AbstractNumbersArray {

    void arrayPrinter() {
        System.out.println("Odd: ");
        for (int inputNumber1 : inputNumbers) {
            if (inputNumber1 % 2 != 0) {
                System.out.println(inputNumber1);
            }
        }
        System.out.println("Even:");
        for (int inputNumber : inputNumbers) {
            if (inputNumber % 2 == 0) {
                System.out.println(inputNumber);
            }
        }
    }

    @Override
    int getLen() {
        return 20;
    }

}