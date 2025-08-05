package threads;
import java.util.Random;

class ColorDisplay implements Runnable {
    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    Random random = new Random();

    @Override
    public void run() {
        while (true) {
            int index = random.nextInt(colours.length);
            String colour = colours[index];
            System.out.println("Colour: " + colour);

            if (colour.equals("red")) {
                System.out.println("Red encountered. Stopping display.");
                break;
            }

            try {
                Thread.sleep(500); // Optional: to slow down output
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RandomColourThread {
    public static void main(String[] args) {
        Thread colourThread = new Thread(new ColorDisplay());
        colourThread.start();
    }
}