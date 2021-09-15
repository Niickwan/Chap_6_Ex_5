package com.company;
import java.util.Scanner;

public class Main {

    public static void isDoubloon (String text) {
        String textDublicate = text.toLowerCase();
        for (int i = 0; i <= text.length() - 1; i++) {
            int counter = 0;
            for (int x = 0; x <= text.length() - 1; x++) {
                if (text.toLowerCase().charAt(i) == textDublicate.toLowerCase().charAt(x)) {
                    counter++;
                }
                if (counter == 3) {
                    System.out.println("The word is not a doubloon!");
                    return;
                }
            }
            if (counter <= 1) {
                System.out.println("The word is not a doubloon!");
                return;
            }
        }
        System.out.println("Yaaaay! The word is a doubloon!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to see it it's a doubloon: ");
        String text = scanner.next();
        isDoubloon(text);
    }
}
