import java.util.Scanner;

public class MaxTries 
{
    public static void main(String[] args) 
    {
        int atm_pin = 1234;
        int user_pin = 0;
        int totalAttempts = 5;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your PIN:");
        user_pin = input.nextInt();
        do{
            if(user_pin == atm_pin)
            {
                System.out.println("correct");
                break;
                
            }

            else if(user_pin != atm_pin)
            {
                System.out.println("wrong");
                totalAttempts -=1;
                
            }
            else{  
                 
            }
        }while(totalAttempts != 0);
        System.out.println("No more attempts left");
    }
}