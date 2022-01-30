import java.util.Scanner;

public class GoLEmementFinder
{
     // DEBUG: prints the content of the array
     public static void printArray(int array_elements[])
    {
        int n = array_elements.length;
        for (int i = 0; i < n; i++)
        {
            System.out.println(array_elements[i] + " ");
        }
    }

    // #3 checks if the previous or the next numbers are greater or lesser
     public static void numChecker(int array_elements[], int n)
     {
        // Traverse array from index 1 to n-2
        // and check for the given condition
        for (int i = 1; i < n - 1; i++)
        {
            if (array_elements[i] > array_elements[i - 1] && array_elements[i] > array_elements[i + 1])
            {
                System.out.print(array_elements[i] + " "); 
            }
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args)
    {
        // declaration of the scanner
        Scanner scan = new Scanner(System.in);

        // ask the user input to the amount of input they want.
        System.out.println("How many inputs?");
        int input_size = scan.nextInt();

        // declares that the array element size is the same as the value of input_size
        int array_elements[] = new int[input_size];

        System.out.println("Enter " + input_size + " Array elements:");
        
        for(int i = 0; i < array_elements.length; i++)
        {
            array_elements[i] = scan.nextInt();
        }
        scan.close();

        System.out.println("These are the numbers you have entered.");
        printArray(array_elements);

        System.out.println("\nThis prints the greater number");
        int n = array_elements.length;
        numChecker(array_elements, n);
    }
}// public class borga3
