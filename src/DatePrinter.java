import java.util.Date;
public class DatePrinter extends Thread {
    public void run(){
        for (int i = 0; i < 20000; i++){
            long millis = System.currentTimeMillis();
            Date date = new Date(millis);
            System.out.println(date);
        }
    }
}
