import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int temp = 1;
        int tempCounter = 0;
        int n = scanner.nextInt();
        while (counter != n) {
            counter++;
            if (tempCounter == temp) {
                tempCounter = 0;
                temp += 1;
            }
            System.out.println(temp);
            tempCounter++;
        }
    }
}
