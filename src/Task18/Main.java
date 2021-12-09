package Task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] mas = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = in.nextInt();
        }

        swapMassivValue(mas);
    }

    public static void swapMassivValue(int[] s1) {
        int sum = 0;

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] % 5 != 0) {
                sum += s1[i];
            }
        }

        System.out.println(sum);
    }
}