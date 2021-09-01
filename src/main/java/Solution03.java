/*
 * UCF COP3330 Fall 2021 Exercise 1 Solution
 * Copyright 2021 Gabriel Martin
 */

/*
 * Ask the user for a quote
 * create new Scanner 'input'
 * String 'quote' = input read by the scanner
 * Ask the user for the author of the quote
 * String 'name' = input read by scanner
 * print(name + "says" + quote) with proper escape techniques for " (\")
 */

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        System.out.println("What is the quote?");
        Scanner input = new Scanner(System.in);

        String quote = input.nextLine();

        System.out.println("Who said this quote?");
        String name = input.nextLine();

        System.out.println(name + " says, " + "\"" + quote + "\"");
    }
}
