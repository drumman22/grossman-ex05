/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Pseudocode --
create input scanner
create variables for x, y, sum, difference, product, quotient
get input for x and y
process x and y for sum, dif, prod, quot
output the sum, dif, prod and quot for x and y
 */

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int x, y, sum, dif, prod, quot;

        // input
        System.out.println("What is the first number? ");
        x = input.nextInt();
        System.out.println("What is the second number? ");
        y = input.nextInt();

        // processing
        sum = x + y;
        dif = x - y;
        prod = x * y;
        quot = x / y;

        // output
        System.out.printf("%1$d + %2$d = %3$d%n%1$d - %2$d = %4$d%n%1$d * %2$d = %5$d%n%1$d / %2$d = %6$d", x, y, sum, dif, prod, quot);
    }
}
