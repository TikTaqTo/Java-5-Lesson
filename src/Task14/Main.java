package Task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[][] mas = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = in.nextInt();
            }
        }

        swapMassivValue(mas);
    }

    public static void swapMassivValue(int[][] s1) {
        int[] tempMas = new int[s1[0].length];

        for (int i = 0; i < s1[0].length; i++) {
            tempMas[i] = s1[0][i];
        }

        for (int i = 0; i < s1[s1.length - 1].length; i++) {
            s1[0][i] = s1[s1.length - 1][i];
        }

        for (int i = 0; i < s1[s1.length - 1].length; i++) {
            s1[s1.length - 1][i] = tempMas[i];
        }

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length; j++) {
                System.out.print(s1[i][j] + " ");
            }
            System.out.println();
        }
    }
}