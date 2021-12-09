package Task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int b = in.nextInt();

        String operation = in.next();

        numberOperation(n, b, operation.charAt(0));
    }

    public static void numberOperation(int s1, int s2, char operator) {
        switch (operator){
            case '+':
                System.out.println(s1+s2);
                break;
            case '-':
                System.out.println(s1-s2);
                break;
            case '*':
                System.out.println(s1*s2);
                break;
            case '/':
                System.out.println(s1/s2);
                break;
            default:
                System.out.println("Not supported that operation");
        }
    }
}