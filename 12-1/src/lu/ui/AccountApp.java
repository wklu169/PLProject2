package lu.ui;

import lu.business.CheckingAccount;
import lu.business.Transactions;

public class AccountApp {

    public static void main(String[] args) {
        // Display welcome message
        Console.displayLine("Welcome to the Account Calculator");
        Console.displayLine();

        // Set the starting balance and display balance
        CheckingAccount c = new CheckingAccount();
        c.setBalance(1000);

        Console.displayLine("Starting Balance");
        Console.displayLine("Checking: " + c.getBalanceFormatted());
        Console.displayLine();
        Console.displayLine("Enter the transactions for the month");

        // Prompt withdrawal or deposit
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            Console.displayLine();
            String w_or_d = Console.getString("Withdraw or deposit? (w/d): ");
            Console.displayLine();

            if (w_or_d.equalsIgnoreCase("w")) {
                double withdrawAmount = Console.getDouble("Amount: ");
                while (withdrawAmount > c.getBalance()){
                    Console.displayLine("Error! Withdrawn amount is greater than the balance.");
                    withdrawAmount = Console.getDouble("Amount: ");
                }
                while (withdrawAmount < 0){
                    Console.displayLine("Error! Withdrawn amount must be greater than $ 0.00.");
                    withdrawAmount = Console.getDouble("Amount: ");
                }
                Transactions.withdraw(c, withdrawAmount);
            } else if (w_or_d.equalsIgnoreCase("d")) {
                double depositedAmount = Console.getDouble("Amount: ");
                while (depositedAmount > 10000){
                    Console.displayLine("Error! Deposited amount is greater than the $10,000.");
                    depositedAmount = Console.getDouble("Amount: ");
                }
                while (depositedAmount < 0){
                    Console.displayLine("Error! Deposited amount must be greater than $ 0.00.");
                    depositedAmount = Console.getDouble("Amount: ");
                }
                Transactions.deposit(c, depositedAmount);
            } else {
                Console.displayLine("Not a valid choice.");
            }

            // Prompt if user would like to continue
            Console.displayLine();
            choice = Console.getString("Continue? (y/n): ");
            while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
                Console.displayLine();
                Console.displayLine("Not a valid choice.");
                Console.displayLine();
                choice = Console.getString("Continue? (y/n): ");
            }
        }

        // Set and display monthly fees
        c.setMonthlyFee(1);
        c.subtractMonthlyFee();

        Console.displayLine();
        Console.displayLine("Monthly Fees");
        Console.displayLine("Checking fee:\t" + c.getMonthlyFeeFormatted());

        // Display final balance
        Console.displayLine();
        Console.displayLine("Final Balance");
        Console.displayLine("Checking: " + c.getBalanceFormatted());
    }
}
