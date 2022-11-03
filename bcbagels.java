/*
 * Gabriel Camarozano
 * 11/2/2022
 * This program is like an online store, where you select your itens and press 6 when finished
 * the program also calculates the subtotal,taxes and total after taxes with a menu showing the itens selected.
 * 
 * PseudoCode:
 * Declare Variables:
 * int userChoice
 * int Bagel
 * int Butter
 * int creamCheese
 * int eggs
 * int Bacon
 * 
 * import scanner and declare scanner
 * 
 * import roundingMode for taxes
 * 
 * loop menu and if statements for choices
 * while (userChoice != 6)
 */

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class bcbagels {
    public static void main (String[] args){
        //Declare Variables
        int userChoice = 0;
        double bagel = 0.0;
        int bagelQuantity = 0;
        double butter = 0.0;
        int butterQuantity = 0;
        double creamCheese = 0.0;
        int creamCheeseQuantity = 0;
        double eggs = 0.0;
        int eggsQuantity = 0;
        double bacon = 0.0;
        int baconQuantity = 0;
        double userTotal = 0.0;
        double tax = 0.07;


        //Declare Scanner
        Scanner keyboard = new Scanner(System.in);

        //Declare Rounding
        DecimalFormat df= new DecimalFormat("0.00");

        //Loop for Menu
       do {
        
        //Menu
            System.out.println("Please choose an Item");
            System.out.println("1-) Bagel  $1.00");
            System.out.println("2-) Butter  $0.50");
            System.out.println("3-) Cream Cheese  $1.00");
            System.out.println("4-) Eggs  $2.75");
            System.out.println("5-) Bacon  $2.25");
            System.out.println("6-) Exit");
            System.out.println("Enter your choice here: ");
            userChoice = keyboard.nextInt();

        //Decision Structure
            if (userChoice == 1){
                userTotal = userTotal + 1.00;
                bagelQuantity = bagelQuantity + 1;
                bagel = bagel + 1.00;
            }
            else if (userChoice == 2){
                userTotal = userTotal + 0.50;
                butterQuantity = butterQuantity + 1;
                butter = butter + 0.50;
            }
            else if (userChoice == 3){
                userTotal = userTotal + 1.00;
                creamCheeseQuantity = creamCheeseQuantity + 1;
                creamCheese = creamCheese + 1.00;
            }
            else if (userChoice == 4){
                userTotal = userTotal + 2.75;
                eggsQuantity = eggsQuantity + 1;
                eggs = eggs + 2.75;
            }
            else if (userChoice == 5){
                userTotal = userTotal + 2.25;
                baconQuantity = baconQuantity + 1;
                bacon = bacon + 2.25;
            }
            else if (userChoice == 6){
                double finalTax = userTotal*tax;
                double total = userTotal + finalTax;
                System.out.println("Item:" + "\t\tQuantity:" + "\tSubtotal:");
                System.out.println("Bagel: " + "\t\t" + bagelQuantity + "\t\t" + bagel);
                System.out.println("Butter: " + "\t" + butterQuantity + "\t\t" + butter);
                System.out.println("Cream Cheese: " + "\t" + creamCheeseQuantity + "\t\t" + creamCheese);
                System.out.println("Eggs: " + "\t\t" + eggsQuantity + "\t\t" + eggs);
                System.out.println("Bacon: " + "\t\t" + baconQuantity + "\t\t" + bacon);
                System.out.println("------------------------------");
                System.out.println("Subtotal: $" + userTotal);
                System.out.println("Tax: $" + df.format(finalTax));
                System.out.println("Total: $" + df.format(total));
            }
            else {
                System.out.println("Invalid response, please choose an item from 1-5 or type 6 to finish!");
            }
    } while (userChoice != 6 && userChoice < 6);
    }
}