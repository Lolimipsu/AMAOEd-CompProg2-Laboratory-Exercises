import java.util.Scanner;

public class MaxTries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int attempts = 5,
            atm_pin = 1234,
            user_pin = 0;

        do {
            System.out.print("Input your ATM PIN:\n");
            user_pin = input.nextInt();

            if (user_pin != atm_pin) {
                attempts -= 1;
                if (attempts == 0) {
                    System.out.println("No more attempts left");
                } else {
                    System.out.println("Wrong PIN, Please try again.");
                    System.out.println("You have " + attempts + " attempts left.");
                }
            } else {
                attempts = 0;
                System.out.println("Nice ATM Pin lol");
            }
        } while (attempts != 0);
    }
}