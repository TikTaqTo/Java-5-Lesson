package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();

        String result = letterDuplicater(a);

        System.out.println(result);
    }

    public static String letterDuplicater(String userString) {
        String result = "";

        for (int i = 0; i < userString.length(); i++) {
            result += userString.charAt(i);
            result += userString.charAt(i);
        }

        return result;
    }
}