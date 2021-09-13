
/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Ihosvany Marquez
 */


package Exercise10;

import java.util.Scanner;


public class Solution10
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double priceItem1 = scan.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int quantityItem1 = scan.nextInt();

        System.out.print("Enter the price of item 2: ");
        double priceItem2 = scan.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int quantityItem2 = scan.nextInt();

        System.out.print("Enter the price of item 3: ");
        double priceItem3 = scan.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int quantityItem3 = scan.nextInt();


        double priceBeforeTaxes = (priceItem1 * quantityItem1) +
                (priceItem2 * quantityItem2) +
                (priceItem3 * quantityItem3);
        double taxes = (priceBeforeTaxes * 5.5) / 100;
        double total = priceBeforeTaxes + taxes;


        System.out.println("Subtotal: $" + priceBeforeTaxes); //print output
        System.out.println("Tax: $" + taxes);
        System.out.println("Total: $" + total);
    }
}
