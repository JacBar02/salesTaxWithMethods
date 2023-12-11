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
