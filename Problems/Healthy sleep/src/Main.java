import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lower = scanner.nextInt();
        int higher = scanner.nextInt();
        int hours = scanner.nextInt();

        if (hours < lower) {
            System.out.println("Deficiency");
        } else if (hours > higher) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}
