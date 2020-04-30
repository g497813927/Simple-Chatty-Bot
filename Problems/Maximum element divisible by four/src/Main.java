import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() + 1;
        int[] elements = new int[n];
        elements[0] = n;
        for (int i = 1; i < n; i++) {
            elements[i] = scanner.nextInt();
        }
        int max = elements[0];
        for (int i = 1; i < n; i++) {
            if (elements[i] % 4 == 0 && elements[i] > max) {
                max = elements[i];
            }
        }
        System.out.println(max);
    }
}
