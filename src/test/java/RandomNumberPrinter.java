import java.util.Random;

public class RandomNumberPrinter {

    public static void printRandomNumbersLimit100() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt();
            System.out.println(randomNumber);
        }
    }

    public static void printRandomNumbers(int limit) {
        Random random = new Random();
        for (int i = 0; i < limit; i++) {
            int randomNumber = random.nextInt();
            System.out.println(randomNumber);
        }
    }

}
