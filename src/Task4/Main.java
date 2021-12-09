package Task4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        char oneLetter = b.charAt(0);

        int result = letterFinder(a, oneLetter);

        System.out.println(result);
    }

    public static int letterFinder(String userString, char letter) {
        String normalizedUserString = userString.toLowerCase(Locale.ROOT);

        int repeatCount = 0;

        for (int i = 0; i < userString.length(); i++) {
            if (normalizedUserString.charAt(i) == letter) {
                repeatCount++;
            }
        }

        return repeatCount;
    }
}