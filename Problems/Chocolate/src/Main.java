import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int want = scanner.nextInt();

        if (couldSpilt(first, second, want)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean couldSpilt(int first, int second, int want) {
        for (int i = 1; i <= first; i++) {
            if (i * second == want) {
                return true;
            }
        }

        for (int i = 1; i <= second; i++) {
            if (i * first == want) {
                return true;
            }
        }

        return false;
    }
}
