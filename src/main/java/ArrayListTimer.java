import java.util.ArrayList;

public class ArrayListTimer extends AbstractTimer{

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        long startTime = getTime();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }
        long endTime = getTime();
        System.out.println("Time of adding: " + (endTime - startTime));

        long startTime2 = getTime();
        if (numbers.contains(1)) {

            long endTime2 = getTime();
            System.out.println("Time of search:" + (endTime2 - startTime2));
        }

        long startTime1 = getTime();
        while (numbers.size() != 0) {
            numbers.remove(0);
        }
        long endTime1 = getTime();
        System.out.println("Time of removing:" + (endTime1 - startTime1));
    }
}