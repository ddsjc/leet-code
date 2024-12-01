package exersizeOfMaksim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String string = "number";
        int number = 4;
        if (number <= 0 || number >= 5) {
            System.out.println(string);
        } else {
            for (int i = 0; i < number; i++) {
                System.out.println(string);
            }
        }
    }
}
