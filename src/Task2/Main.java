package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        String result = twoDivined(a) ? "Yes" : "No";

        System.out.println(result);
    }

    public static boolean twoDivined(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }
}