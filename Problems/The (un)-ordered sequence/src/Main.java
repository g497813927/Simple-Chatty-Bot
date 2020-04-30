import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int num = scanner.nextInt();
        while (num != 0) {
            list.add(num);
            num = scanner.nextInt();
        }

        if (isInOrder(list) || isInReversedOrder(list)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static boolean isInOrder(ArrayList<Integer> list) {
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i - 1) || list.get(i) > list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isInReversedOrder(ArrayList<Integer> list) {
        for (int i = list.size() - 2; i > 1; i--) {
            if (list.get(i) > list.get(i - 1) || list.get(i) < list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
