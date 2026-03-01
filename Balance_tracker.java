import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("=======    Simple Expenses Management System   =======");

        // Input the total budget
        System.out.print("\nEnter your total balance: ");
        double budget = readDouble(input);

        // Input different expense categories
        System.out.println("\nEnter your expenses for the following categories: ");
        
        System.out.println("\n==============================");

        System.out.print("\n1. Food & Drinks: ");
        double food = readDouble(input);

        System.out.print("2. Transportation: ");
        double transport = readDouble(input);

        System.out.print("3. Entertainment: ");
        double entertainment = readDouble(input);

        System.out.print("4. Other Expenses: ");
        double others = readDouble(input);

        // Calculations
        double totalExpenses = food + transport + entertainment + others;
        double balance = budget - totalExpenses;

        // Results
        System.out.println("\n------------------------------");
        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Remaining Balance: " + balance);

        // Evaluate if something unusual
        if (balance < 0) 
        {
           double exceeded = balance * -1;
           System.out.println("Warning: You have exceeded your budget by: " + exceeded);
        } 
        else if (balance == 0) 
        {
            System.out.println("Alert: You have spent your exact budget amount.");
        }
        else 
        {
            System.out.println("Great job! You managed to save some money this time.");
        }
        System.out.println("------------------------------");
        
        input.close();
    }
    
    // Safe Input
    public static double readDouble(Scanner input) 
    {
        while (!input.hasNextDouble()) 
        {
            System.out.print("Invalid input. Please enter a valid number: ");
            input.next();
        }
        return input.nextDouble();
    }
}
