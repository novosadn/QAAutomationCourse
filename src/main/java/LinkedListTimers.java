import java.util.LinkedList;

public class LinkedListTimers extends AbstractTimer {
    public static void main(String[] args) {

        LinkedList<Integer> age = new LinkedList<Integer>();

        long startTime = getTime();
        for (int i = 0; i < 1000000; i++) {
            age.add(i);
        }
        long endTime = getTime();
        System.out.println("Time of adding: " + (endTime - startTime));

        long startTime2 = getTime();
        if (age.contains(9898)) {
            long endTime2 = getTime();
            System.out.println("Time of search:" + (endTime2 - startTime2));
        }

        long startTime1 = getTime();
        while (age.size() != 0) {
            age.remove(0);
        }
        long endTime1 = getTime();
        System.out.println("Time of removing:" + (endTime1-startTime1));
    }
}