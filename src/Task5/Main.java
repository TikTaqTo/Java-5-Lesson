package Task5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();

        int result = letterFinder(a);

        System.out.println(result);
    }

    public static int letterFinder(String userString) {
        String normalizedUserString = userString.toLowerCase(Locale.ROOT);

        int repeatCount = 0;

        for (int i = 0; i < userString.length(); i++) {
            if(normalizedUserString.charAt(i) == 'a' || normalizedUserString.charAt(i) == 'e' || normalizedUserString.charAt(i) == 'i' || normalizedUserString.charAt(i) == 'o' || normalizedUserString.charAt(i) == 'i'){
                repeatCount++;
            }
        }

        return repeatCount;
    }
}