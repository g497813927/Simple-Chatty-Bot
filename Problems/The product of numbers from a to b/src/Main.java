import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        long multiplication = 1;
        for (int i = first; i < second; i++) {
            multiplication *= i;
        }
        System.out.println(multiplication);
    }
}