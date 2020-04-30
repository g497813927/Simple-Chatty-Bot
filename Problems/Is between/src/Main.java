import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        int thirdInt = scanner.nextInt();
        if (firstInt >= secondInt && firstInt <= thirdInt || firstInt <= secondInt && firstInt >= thirdInt) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
