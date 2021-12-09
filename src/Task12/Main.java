package Task12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] mas = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = in.nextInt();
        }

        averageSum(mas);
    }

    public static void averageSum(int[] s1) {
        int sum = 0;
        int oddNumberSum = 0;
        double averageOdd = 0;

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] % 2 == 0) {
                sum+=s1[i];
                oddNumberSum++;
            }
        }

        averageOdd = sum / averageOdd;

        System.out.println(averageOdd);
    }
}