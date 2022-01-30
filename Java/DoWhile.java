import java.util.Scanner;
public class DoWhile
{
	public static void main(String[] args) 
    {
		String name;
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Please input name:");
            name = scan.next();
            System.out.println("Hello Mr. " + name);
            System.out.println("would you like to change your name? insert 1 for yes and 2 for no.");
            answer = scan.nextInt();
        }
        while(answer == 1);
    }
}