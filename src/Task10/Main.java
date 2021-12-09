package Task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.next();
        String password = in.next();

        String result = isUser(name, password) ? "Authentication completed" : "Invalid login or password";

        System.out.println(result);
    }

    public static boolean isUser(String s1, String s2) {

        if(s1 == "admin" && s2 == "qwerty"){
            return true;
        }

        return false;
    }
}