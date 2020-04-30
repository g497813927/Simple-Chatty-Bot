import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();
        double profit;
        int counter = 0;
        while (m < k) {
            profit = m * p / 100.0;
            m = m + profit;
            counter++;
        }

        System.out.println(counter);

    }
}