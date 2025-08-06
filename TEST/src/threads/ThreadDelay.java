package threads;
class PrintNumbers extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                if (i == 5) {
                    Thread.sleep(5000); // 5000 ms delay
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadDelay {
    public static void main(String[] args) {
        PrintNumbers t = new PrintNumbers();
        t.start();
    }
}