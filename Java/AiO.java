import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;

// All in ONE (AiO)
public class AiO {
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Main menu
    public static void main(String[] args) throws IOException, InterruptedException {
        // Definitions
        Scanner input = new Scanner(System.in);
        int run_again = 0;

        while (run_again != 2) {
            System.out.println("Which program would you like to run today?");
            System.out.println("1 - Do While Loop\n2 - Greater than or Less than Element Finder\n3 - Max Tries\nInput:");
            int menu_choice = input.nextInt();

            switch (menu_choice) {
                case 1:
                    String name;
                    int answer = 0;
                    do {
                        System.out.println("Please input name:");
                        name = input.next();
                        System.out.println("Hello Mr. " + name);
                        System.out.println("would you like to change your name? insert 1 for yes and 2 for no.");
                        answer = input.nextInt();
                    } while (answer == 1);
                    break;

                case 2:
                    int input_size;
                    // ask the user input to the amount of input they want.
                    System.out.println("How many inputs?");
                    input_size = input.nextInt();
                    // declares that the array element size is the same as the value of input_size
                    int array_elements[] = new int[input_size];
                    System.out.println("Enter " + input_size + " Array elements:");
                    for (int i = 0; i < array_elements.length; i++) {
                        array_elements[i] = input.nextInt();
                    }

                    System.out.println("These are the numbers you have entered.");
                    printArray(array_elements);

                    System.out.println("\nThis prints the greater number");
                    int n = array_elements.length;

                    numChecker(array_elements, n);
                    for (int i = 0; i < n; i++) {
                        System.out.print(array_elements[i] + ", ");
                    }
                    break;

                case 3:

                    break;

                default:
                    System.out.println("Please choose a valid option.");
                    break;

            } // switch
            System.out.println("\n\nWould you like to run the program again?\n1 - YES\t2 - NO");
            run_again = input.nextInt();
            Clear_Screen();
        } // while loop

    } // main

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Greater than or Less than Element Finder
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // #1 DEBUG PRINT
    private static void printArray(int array_elements[]) {
        int n = array_elements.length;
        for (int i = 0; i < n; i++) {
            System.out.println(array_elements[i] + " ");
        }
    }

    // #2 checks if the previous or the next numbers are greater or lesser
    private static void numChecker(int array_elements[], int n) {
        Arrays.sort(array_elements);
        int[] temporary_Array = new int[n];
        int Index = 0;
        for (int i = 0, j = n - 1; i <= n / 2 || j > n / 2; i++, j--) {
            if (Index < n) {
                temporary_Array[Index] = array_elements[i];
                Index++;
            }
            if (Index < n) {
                temporary_Array[Index] = array_elements[j];
                Index++;
            }
        }
        for (int i = 0; i < n; i++)
            array_elements[i] = temporary_Array[i];
    }

    // CLEAR SCREEN
    private static void Clear_Screen() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

} // public class AiO
