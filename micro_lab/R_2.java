package splitwise.micro_lab;

public class R_2 {
    public static void main(String[] args) {
        // Lab A — Arithmetic

// 1. Compute and print 17 / 5 as int
        System.out.println(17 / 5);

// 2. Compute and print 17.0 / 5
        System.out.println(17.0 / 5);

// 3. Compute and print 17 % 5
        System.out.println(17 % 5);


// Lab B — Relational and boolean

// Given int choice = 2
        int choice = 2;

// 1. Check choice == 2
        System.out.println(choice == 2);

// 2. Check choice != 3
        System.out.println(choice != 3);

// 3. Check choice >= 1 && choice <= 3
        System.out.println(choice >= 1 && choice <= 3);


// Lab C — if / else if

// Write a program that prints Add, View, or Exit for choices 1–3,
// and Invalid otherwise. Use if/else if.

        if (choice == 1) {
            System.out.println("Add");
        } else if (choice == 2) {
            System.out.println("View");
        } else if (choice == 3) {
            System.out.println("Exit");
        } else {
            System.out.println("Invalid");
        }


// Lab D — switch

// Rewrite Lab C using a switch expression that assigns a String message,
// then print it.

        String message = switch (choice) {
            case 1 -> "Add";
            case 2 -> "View";
            case 3 -> "Exit";
            default -> "Invalid";
        };

        System.out.println(message);


// Lab E — loops

// 1. Print numbers 1 to 5 using for

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

// 2. Print numbers 5 down to 1 using while

        int i = 5;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
