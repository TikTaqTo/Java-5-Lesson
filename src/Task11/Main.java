package Task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] mas = new int[n];

        minMax(mas);
    }

    public static void minMax(int[] s1) {
        int min = s1[0];
        int max = s1[0];

        for (int i = 0; i < s1.length; i++) {
            if(min > s1[i]){
                min = s1[i];
            }
            if(max < s1[i]){
                max = s1[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}