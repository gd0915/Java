package project02_grocery;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Shopping {

    /* TASK :
        * Type a simple supermarket shopping program with 5 products.
        *
        * 1. Step : Get the user choose a product from the shopping list ve ask him/her how much does he/she want to buy in kg.
        * 2. Step : Ask if they want to buy another product.
        *         if not show the total on the screen, if they want to add more allow them to add.
        *         Repeat this action until they want to quit.
        * 3. Step : Add the price of each product into total price when the shopper adds a new product.
        * 4. Step : At the end of the shopping show total price to the shopper.

       Flow:
       There will be following methods in that class
        * main() method
        * addToCart() method
        * printCart() method
        * choose a product method ==> getList()
        * shopping() method
        * *checkout() method
         */

//    static List<String> products = new ArrayList<>(Arrays.asList("Potato", "Onion", "Tomato", "Carrot", "Orange"));
//
//    static List<Double> prices = new ArrayList<>(Arrays.asList(6.50, 4.50, 2.30, 6.90, 5.90));
//
//    static List<String> shoppingCart = new ArrayList<>();
//    static List<Double> totalAmount = new ArrayList<>();
//    static List<Double> totalPrice = new ArrayList<>();
//    static Scanner scan = new Scanner(System.in);
//
//
//    public static void main(String[] args) {
//
//
//       shopping();
//
//    }
//
//    public static void shopping() {
//        String options;
//        double totalPrice = 0;
//
//        do {
//            getList();
//
//            System.out.println("Please select the product number you want to add to your shopping cart from the list");
//            int productNumber = scan.nextInt();
//            System.out.println("Enter the amount in kilogram please");
//            double amount = scan.nextDouble();
//            try {
//                addToCart(productNumber, amount);
//            } catch (IndexOutOfBoundsException e) {
//                System.out.println("The given product number is not valid");
//                shopping();
//                break;
//            }
//
//            totalPrice = Math.round(printCart());
//            System.out.println("To continue shopping press 'e' \n to finish press 'q' ");
//
//            options = scan.next().toLowerCase().substring(0, 1);
//
//        } while (options.equalsIgnoreCase("e"));
//
//        checkout(totalPrice);
//
//    }
//
//
//
//    private static void checkout(double totalPrice) {
//        System.out.println("============CHECKOUT===========");
//        System.out.printf("Amount To Be Paid: %.2f", totalPrice);
//
//        double paidMoney =0.0;
//        do{
//            System.out.println(" Please enter the amount you will pay");
//            paidMoney = scan.nextDouble();
//            if(paidMoney< totalPrice){
//                System.out.println("Please enter an appropriate amount");
//                System.out.println("The amount to be paid : " + (totalPrice - paidMoney));
//            }
//
//        }while(paidMoney<totalPrice);
//
//        double change = paidMoney - totalPrice;
//        if(change>0){
//            System.out.println("Change Money : " + change);
//        }
//        System.out.println("Hope to see you again!");
//    }
//
//
//    public static double printCart(){
//            double sumOfPrice = 0.0;
//            double sumOfAmount =0.0;
//        System.out.println( "Product Name / Product Amount-gram /  Total Price");
//          for(int i=0; i<shoppingCart.size(); i++){
//
//            System.out.println(shoppingCart.get(i) + "             " + totalAmount.get(i) + "                  " + totalPrice.get(i) );
//            sumOfPrice += totalPrice.get(i);
//            sumOfAmount += totalAmount.get(i);
//
//        }
//        System.out.println("The total amount of products : " + totalAmount + " Total price to pay  : " + totalPrice  );
//        return sumOfPrice;
//    }
//
//    public static void addToCart(int productNumber, double amount) {
//        if (productNumber < 0 && productNumber > 4) {
//            throw new IndexOutOfBoundsException(" The chosen product number should exist in the list between 0 - 4");
//        }
//            shoppingCart.add(products.get(productNumber));
//            totalAmount.add(amount);
//            totalPrice.add(amount * prices.get(productNumber));
//
//
//    }
//
//    public static void getList(){
//
//        System.out.println( "Product Number / Product Name / Product Price");
//
//        for(int i=0; i<products.size(); i++){
//            System.out.println(i + " - " + products.get(i) + " " +  prices.get(i));
//        }
//
//    }






}
