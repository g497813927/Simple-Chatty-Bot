import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first > 0 && second <= 0 && third <= 0) {
            System.out.println(true);
        } else if (first <= 0 && second > 0 && third <= 0) {
            System.out.println(true);
        } else if (first <= 0 && second <= 0 && third > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}