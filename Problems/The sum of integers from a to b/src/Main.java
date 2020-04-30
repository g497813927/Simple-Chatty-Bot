import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int sum = 0;

        for (int i = first; i <= second; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}