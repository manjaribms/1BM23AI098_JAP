package BM23AI098;

import java.util.Scanner;

public class gymmemb {
    int age;
    String name;
    int duration;
    boolean isActive;
    int fee;
    int prfee;

    void input_values() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the member's name: ");
        name = scanner.nextLine();

        System.out.print("Enter the member's age: ");
        age = scanner.nextInt();

        System.out.print("Enter the membership duration (in months): ");
        duration = scanner.nextInt();

        System.out.print("Is the member active? (true/false): ");
        isActive = scanner.nextBoolean();

        System.out.print("Enter the membership fee (monthly): ");
        fee = scanner.nextInt();

        System.out.print("Enter the promotional fee (if any): ");
        prfee = scanner.nextInt();

        scanner.close();
    }

    int calculateTotalFee() {
        int totalFee = fee * duration;

        if (isActive) {
            totalFee -= prfee;
        }

        return totalFee;
    }

    void display_values() {
        System.out.println("\nMember Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Active Member: " + (isActive ? "Yes" : "No"));
        System.out.println("Membership Fee (Monthly): $" + fee);
        System.out.println("Promotional Fee: $" + prfee);
        System.out.println("Total Membership Fee: $" + calculateTotalFee());
    }

    public static void main(String[] args) {
        gymmemb member = new gymmemb();

        member.input_values();
        member.display_values();
    }
}