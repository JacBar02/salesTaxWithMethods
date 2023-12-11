package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double inputData = inputPurchasePrice();
        double stateTax = calculateTax(inputData, .04);
        double countyTax = calculateTax(inputData, .02);
        double totalSalesTax = calculateTotal(stateTax, countyTax);
        double totalSale = calculateTotal(inputData, totalSalesTax);
        displaysTotals(inputData, stateTax, countyTax, totalSalesTax, totalSale);
    }

<<<<<<< HEAD
    public static double inputPurchasePrice() {
        double purchasePrice;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter purchase price: ");
        purchasePrice = scanner.nextDouble();
        return purchasePrice;
    }

    public static double calculateTax(double inputdata, double taxrate){
        return inputdata * taxrate;
    }

    public static double calculateTotal(double numberone, double numbertwo){
        return numberone + numbertwo;
    }

    public static void displaysTotals(double inputData, double stateTax, double countyTax, double totalSalesTax, double totalSale) {
        System.out.printf("Purchase Price: $%.2f\n", inputData);
        System.out.printf("State Tax (4%%): $%.2f\n", stateTax);
        System.out.printf("County Tax (2%%): $%.2f\n", countyTax);
        System.out.printf("Total Sales Tax: $%.2f\n", totalSalesTax);
        System.out.printf("Total Sale: $%.2f\n", totalSale);
    }
}
=======
    /* Write a method called inputPurchasePrice that
    *  takes the user input for price, converts to
    *  a double, and returns the price as a double
    * */

    /* Write a method called calculateTax that
     * accepts a double called price and a double called
     * tax rate as parameters and calculates and returns the tax
     * */

    /* Write a method called calculateTotal that
     * accepts two double values and returns the sum
     * */

    /* Write a method called displayTotals that takes
    *  purchasePrice, stateTax, countyTax, totalTax and totalPrice
    *  as double parameters. Output using decimal formatter amd printf */
>>>>>>> 25896f5e995b6debbb6a0c58ec3e43044b646ba9

