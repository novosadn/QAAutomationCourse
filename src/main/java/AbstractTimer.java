import java.util.Date;

abstract class AbstractTimer {
    static long getTime() {
        {
            Date date = new Date();
            return date.getTime();
        }
    }

}