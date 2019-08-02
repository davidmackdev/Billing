/* Practice with overloaded methods.

Author: David
Date: 08/02/19
File: Billing.java

Create a method that can handle multiple parameters, or just one.  This method will calculate a bill
*/

import java.util.Scanner;

public class Billing
{
	public static void main(String[] args) 
	{
		double price = 15.99;
		int quantity = 2;
		double coupon = 0.1;
		static double tax = 0.08; 	

		computeBill(price);
		computeBill(price, quantity);
		computeBill(price, quantity, coupon);
	}

	public static double computeBill(int price)
	{
		double taxTotal = price * tax;
		return price + taxTotal;
	}

	public static double computeBill(double price, int quantity)
	{
		double priceQuantity = price * quantity;
		double taxTotal = priceQuantity * tax;
		return priceQuantity + taxTotal;	
	}

	public static double computeBill(double price, int quantity, double coupon)
	{
		double priceQuantity = price * quantity
		double discount = priceQuantity * coupon;
		double total = priceQuantity - discount
		double taxTotal = total * tax;
		return total + tax;  
	}
}