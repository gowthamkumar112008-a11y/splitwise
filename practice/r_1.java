package splitwise.practice;

public class r_1 {

        public static void main(String[] args) {

            // Change expense to Lunch, amount to 800.0, people to 5. Print updated share.
            String expense = "Lunch";
            double amount = 800.0;
            int people = 5;
            double share = amount / people;
            System.out.println("Updated share = " + share);


            // Add APP_VERSION = "0.1" and print it in heading.
            final String APP_VERSION = "0.1";
            System.out.println("App Version = " + APP_VERSION);


            // Declare boolean isActive = true and print App active: true.
            boolean isActive = true;
            System.out.println("App active: " + isActive);


            // Compute total if each person pays 250.0 and there are 6 people.
            double eachPersonPays = 250.0;
            int numberOfPeople = 6;
            double total = eachPersonPays * numberOfPeople;
            System.out.println("Total = " + total);


            // Print 2.0 / 1.1 and observe the floating-point result.
            System.out.println(2.0 / 1.1);


            // Store byte, short, and int values. Print each.
            byte b = 100;
            short s = 10000;
            int i = 100000;
            System.out.println("Byte = " + b);
            System.out.println("Short = " + s);
            System.out.println("Int = " + i);
            // byte: -128 to 127, short: -32768 to 32767, int: -2147483648 to 2147483647.


            // Use long to store 9_000_000_000L. Print it.
            long largeNumber = 9_000_000_000L;
            System.out.println("Long = " + largeNumber);
            // int is insufficient because its maximum value is 2,147,483,647.


            // Cast 300 to byte and print the result.
            int number = 300;
            byte result = (byte) number;
            System.out.println("300 cast to byte = " + result);
            // 300 is outside byte range, so casting causes loss of information.


            // Declare variables at the top of main and assign values later.
            String name;
            int age;
            double price;

            name = "Gowtham";
            age = 20;
            price = 500.0;

            System.out.println("Name = " + name);
            System.out.println("Age = " + age);
            System.out.println("Price = " + price);


            // Add comments explaining each section of the Splitwise program.
            // Comments are added to explain each section.
            System.out.println("Comments added successfully.");


            // Total 1000.0, 3 people. Print share as double.
            double totalExpense = 1000.0;
            int persons = 3;
            double expenseShare = totalExpense / persons;

            System.out.println("Share = " + expenseShare);
            // double may not represent some decimal values exactly, so exact rupee splits are not always possible.


            // Move fixed text into final constants at the top of main.
            final String APP_TITLE = "=== Splitwise Console Backend ===";
            final String STATUS_MESSAGE = "App is active";

            System.out.println(APP_TITLE);
            System.out.println(STATUS_MESSAGE);
        }

}
