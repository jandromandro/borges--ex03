/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Marcos Borges
 */

package exercise03;

/*
Create a program that prompts for a quote and an author.
Display the quotation and author.
 */

import java.util.Scanner;

public class Solution03 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What is the quote?");
        String quote = in.nextLine();
        System.out.println("Who said it?");
        String author = in.nextLine();
        System.out.println(author + " says," + quote);

    }
}
