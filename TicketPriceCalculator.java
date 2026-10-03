import java.util.Scanner;

public class TicketPriceCalculator {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

      
        double price = 0.0;

       
        System.out.print("Enter age: ");
        int age = kbd.nextInt();

        System.out.print("Is it a weekend movie [true/false]: ");
        boolean wknd = kbd.nextBoolean();
        kbd.nextLine();
        System.out.println("");

        if (wknd) {
            if (age < 13) {
                price = 10.00;
            } else if (age >=13 && age <= 59) {
                price = 15.00;
            } else {
                price = 12.00;
            }
        } else {
            if (age < 13) {
                price = 8.00;
            } else if (age >=13 && age <= 59) {
                price = 12.00;
            } else {
                price = 9.00;
            }
        }
		
        System.out.printf("Movie Ticket Price Calculator%n");
        System.out.printf("-----------------------------%n");
        System.out.printf("Age: %d%n", age);
        System.out.printf("Weekend: %b%n", wknd);
        System.out.printf("Ticket Price: $%.2f%n", price);
    }
}