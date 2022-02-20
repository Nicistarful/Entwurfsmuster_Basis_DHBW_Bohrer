package state;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Logger {
    public static void log(String text) {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date) + "   " + text);
    }
}
