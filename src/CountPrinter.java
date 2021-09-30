public class CountPrinter extends Thread {
    public void run() {
        for (int i = 1; i < 20000; i++) {
            System.out.println(i);
        }
        System.out.println();
    }
}
