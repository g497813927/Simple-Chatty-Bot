import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char[] chars = {'a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U'};
        for (char c: chars) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
