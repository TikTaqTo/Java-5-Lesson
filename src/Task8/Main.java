package Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] mas = new int[a];

        for (int i = 0; i < a; i++) {
            mas[i] = in.nextInt();
        }

        System.out.println(isPalindrome(mas));
    }

    public static int isPalindrome(int[] s1) {
        int zeroCount = 0;

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != 0) {
                zeroCount++;
            }
        }

        return zeroCount;
    }
}