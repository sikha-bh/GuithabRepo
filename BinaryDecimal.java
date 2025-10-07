import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter binary number: ");
            String binary = sc.next();
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal: " + decimal);
        }
        else if (choice == 2) {
            System.out.print("Enter decimal number: ");
            int decimal = sc.nextInt();
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary: " + binary);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
