import java.util.Scanner;

public class MaxTries {
    public static void main(String[] args) {
        int atm_pin;
        int max_tries = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Please input PIN:");
            atm_pin = scan.nextInt();

            if (atm_pin == 1234) {
                System.out.println("Nice ATM pin lol");
                max_tries += 5;
            }
            else {
                System.out.println("try again!\n");
                max_tries += 1;
            }
        } while (max_tries < 5);
    }
}