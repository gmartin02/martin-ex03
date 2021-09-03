/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Gabriel Martin
 */

/*
 * prompt for a quote
 * create new Scanner 'input'
 * String 'quote' = input read by the scanner
 * prompt for author of quote
 * String 'author' = author of quote
 * print(name + "says" + quote) with escape techniques for " (\")
 */

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        System.out.println("What is the quote?");
        Scanner input = new Scanner(System.in);

        String quote = input.nextLine();

        System.out.println("Who said this quote?");
        String author = input.nextLine();

        System.out.println(author + " says, " + "\"" + quote + "\"");
    }
}
