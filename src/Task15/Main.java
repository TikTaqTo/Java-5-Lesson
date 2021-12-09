package Task15;

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
        int maxElement = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length; j++) {
                if(s1[i][j] > maxElement){
                    maxElement = s1[i][j];
                }
            }
            System.out.println(maxElement);
            maxElement = 0;
        }

    }
}