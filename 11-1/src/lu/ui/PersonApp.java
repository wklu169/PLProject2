package lu.ui;

import lu.business.*;

public class PersonApp {

    public static void main(String[] args) {
        // Display welcome message
        Console.displayLine("Welcome to the Person Tester application");

        // Prompt customer or employee
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            Console.displayLine();
            String c_or_e = Console.getString("Create customer or employee? (c/e): ");
            Console.displayLine();

            if (c_or_e.equalsIgnoreCase("c")){
                Customer c = new Customer();
                c.setFirstName(Console.getString("Enter first name: "));
                c.setLastName(Console.getString("Enter last name: "));
                c.setEmail(Console.getString("Enter email address: "));
                c.setCustomerNumber(Console.getString("Customer number: "));
                Console.displayLine();

                Console.displayLine("You entered:");
                Console.displayLine(c.getDisplayText());
            } else if (c_or_e.equalsIgnoreCase("e")){
                Employee e = new Employee();
                e.setFirstName(Console.getString("Enter first name: "));
                e.setLastName(Console.getString("Enter last name: "));
                e.setEmail(Console.getString("Enter email address: "));
                e.setSsn(Console.getString("Social Security number: "));
                Console.displayLine();

                Console.displayLine("You entered:");
                Console.displayLine(e.getDisplayText());
            } else{
                Console.displayLine("Not a valid choice.");
            }

            // Prompt if user would like to continue
            Console.displayLine();
            choice = Console.getString("Continue? (y/n): ");
            while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n") ){
                Console.displayLine();
                Console.displayLine("Not a valid choice.");
                Console.displayLine();
                choice = Console.getString("Continue? (y/n): ");
            }
        }
    }
}