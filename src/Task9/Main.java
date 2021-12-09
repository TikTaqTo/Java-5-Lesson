package Task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] mas = new int[a];

        for (int i = 0; i < a; i++) {
            mas[i] = in.nextInt();
        }

        isUnique(mas);
    }

    public static void isUnique(int[] s1) {
        boolean isUniqueChar = true;

        for (int i = 0; i < s1.length; i++) {

            for (int j = i + 1; j < s1.length; j++) {
                if(s1[i] == s1[j]){
                    isUniqueChar = false;
                    break;
                }
            }

            if(isUniqueChar){
                System.out.println(s1[i]);
            }

            isUniqueChar = true;
        }
    }
}