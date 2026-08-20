package splitwise.practice;

public class r_2 {

    public static void main(String[] args) {

        // Add menu option text constants as final String values and use them in prints.
        final String OPTION_1 = "1. Add Expense";
        final String OPTION_2 = "2. View Expenses";
        final String OPTION_3 = "3. Exit";

        System.out.println(OPTION_1);
        System.out.println(OPTION_2);
        System.out.println(OPTION_3);


        // Print Invalid choice only when input is not 1, 2, or 3 using && and ||.
        int choice = 4;

        if (choice != 1 && choice != 2 && choice != 3) {
            System.out.println("Invalid choice");
        }


        // Use a for loop to print the menu title three times.
        for (int i = 0; i < 3; i++) {
            System.out.println("=== Splitwise Menu ===");
        }


        // Convert x += 1 to equivalent long form and explain.
        int x = 0;
        x = x + 1;
        System.out.println("x = " + x);
        // x += 1 is the short form of x = x + 1.


        // Add a default branch that prints a helpful message.
        switch (choice) {
            case 1:
                System.out.println("Adding expense");
                break;

            case 2:
                System.out.println("Viewing expenses");
                break;

            case 3:
                System.out.println("Exiting");
                break;

            default:
                System.out.println("Please choose a valid menu option.");
        }


        // Rewrite menu handling using if/else if instead of switch.
        if (choice == 1) {
            System.out.println("Adding expense");
        } else if (choice == 2) {
            System.out.println("Viewing expenses");
        } else if (choice == 3) {
            System.out.println("Exiting");
        } else {
            System.out.println("Please choose a valid menu option.");
        }


        // Add option 0 as a hidden exit that also stops the loop.
        boolean running = true;
        int menuChoice = 0;

        while (running) {

            if (menuChoice == 0) {
                System.out.println("Hidden exit selected.");
                running = false;
            } else {
                System.out.println("Menu is running.");
                break;
            }
        }


        // Use the conditional operator to pick message based on running.
        String message = running ? "Still running" : "Bye";
        System.out.println(message);


        // Validate NUMBER_OF_PEOPLE > 0 before showing share.
        final int NUMBER_OF_PEOPLE = 5;
        double amount = 1000.0;

        if (NUMBER_OF_PEOPLE > 0) {
            double share = amount / NUMBER_OF_PEOPLE;
            System.out.println("Share = " + share);
        } else {
            System.out.println("Warning: Number of people must be greater than zero.");
        }


        // Count how many menu iterations ran using menuCount incremented each loop.
        int menuCount = 0;

        for (int i = 0; i < 3; i++) {
            menuCount++;
            System.out.println("Menu displayed");
        }

        System.out.println("Menu iterations = " + menuCount);


        // Before printing share, if NUMBER_OF_PEOPLE <= 0, print error and skip share line;
        // otherwise print share. Use if/else inside case 2.
        int choiceForShare = 2;
        final int NUMBER_OF_PEOPLE_2 = 3;
        double totalAmount = 1000.0;

        switch (choiceForShare) {

            case 1:
                System.out.println("Add Expense");
                break;

            case 2:
                if (NUMBER_OF_PEOPLE_2 <= 0) {
                    System.out.println("Error: Number of people must be greater than zero.");
                } else {
                    double share = totalAmount / NUMBER_OF_PEOPLE_2;
                    System.out.println("Share = " + share);
                }
                break;

            case 3:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid choice");
        }


        // Refactor case 1 and case 2 into separate methods.
        handleAddExpense();
        handleViewExpenses();
    }


    // Handles case 1: Add Expense.
    static void handleAddExpense() {
        System.out.println("Adding expense...");
    }


    // Handles case 2: View Expenses.
    static void handleViewExpenses() {
        System.out.println("Viewing expenses...");
    }
}
