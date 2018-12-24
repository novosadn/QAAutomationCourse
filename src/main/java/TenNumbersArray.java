class TenNumbersArray extends AbstractNumbersArray {

    void arrayPrinter() {
        for (int i = inputNumbers.length - 1; i>=0; i--) {
            System.out.println(inputNumbers[i] + ",");
        }
    }

    @Override
    int getLen() {
        return 10;
    }
}