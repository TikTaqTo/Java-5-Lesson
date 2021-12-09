package Task6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();

        boolean result = isPalindrome(a);

        System.out.println(result);
    }

    public static boolean isPalindrome(String userString) {

        boolean isPalindrome = true;

        for (int i = 0, j = userString.length()-1; i < userString.length(); i++, j--) {
            if(userString.charAt(i) != userString.charAt(j)){
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }
}