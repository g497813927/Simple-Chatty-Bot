import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>();
        int temp = -1;
        do {
            temp = scanner.nextInt();
            ints.add(temp);
        } while (temp != 0);
        int sum = 0;
        for (int i: ints) {
            sum += i;
        }
        System.out.println(sum);
    }
}