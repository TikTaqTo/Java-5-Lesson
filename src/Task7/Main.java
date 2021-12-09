package Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        boolean result = isPalindrome(a, b);

        System.out.println(result);
    }

    public static boolean isPalindrome(String s1, String s2) {
        if(s1.contains(s2)){
            return true;
        }
        return false;
    }
}