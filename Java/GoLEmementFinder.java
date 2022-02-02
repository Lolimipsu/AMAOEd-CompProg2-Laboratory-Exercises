import java.util.Scanner;
import java.util.Arrays;

public class GoLEmementFinder
{
     // DEBUGGER: prints the content of the array
     public static void printArray(int array_elements[])
    {
        int n = array_elements.length;
        for (int i = 0; i < n; i++)
        {
            System.out.println(array_elements[i] + " ");
        }
    }

    // #2 checks if the previous or the next numbers are greater or lesser
     public static void numChecker(int array_elements[], int n)
     {
        Arrays.sort(array_elements);
        int[] temporary_Array = new int[n];
        int Index = 0;
        for (int i = 0, j = n - 1; i <= n / 2 || j > n / 2; i++, j--)
        {
            if(Index < n)
            {
                temporary_Array[Index] = array_elements[i];
                Index++;
            }
            if(Index < n)
            {
                temporary_Array[Index] = array_elements[j];
                Index++;
            }
        }
        for (int i = 0; i < n; i++)
            array_elements[i] = temporary_Array[i];
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args)
    {
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
        for (int i = 0; i < n; i++)
        {
            System.out.print(array_elements[i]+", ");
        }
       
    }
}// public class borga3
