package splitwise;


import java.util.Scanner;

public class SplitwiseApp {
    public static void main(String[] args) {
        final String EXPENSE_DESCRIPTION = "Dinner";
        final double TOTAL_AMOUNT = 1200.0;
        final int NUMBER_OF_PEOPLE = 4;
        double individualShare = TOTAL_AMOUNT / NUMBER_OF_PEOPLE;

        Scanner sc=new Scanner(System.in);
        boolean running=true;

        while (running) {
            System.out.println("=== Splitwise Console Backend ===");
            System.out.println();
            System.out.println("1. Add expense");
            System.out.println("2. View expenses");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {

                case 1 -> {
                    System.out.println("Recording expense (sample data)...");
                    System.out.println("Expense saved: " + EXPENSE_DESCRIPTION + " | amount=" + TOTAL_AMOUNT + " | people=" + NUMBER_OF_PEOPLE);
                }

                case 2 -> {
                    System.out.println("\n--- Expense Summary ---\n");
                    System.out.println("Description : " + EXPENSE_DESCRIPTION);
                    System.out.println("Total amount: " + TOTAL_AMOUNT);
                    System.out.println("People      : " + NUMBER_OF_PEOPLE);
                    System.out.println("Each pays   : " + individualShare);
                }

                case 3 -> running = false;

                default ->
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");

            }
        }

        System.out.println(
                "Goodbye! Thank you for using Splitwise Console Backend.");

        sc.close();
    }
}