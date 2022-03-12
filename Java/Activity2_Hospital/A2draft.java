import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class A2draft {
    public static void main(String[] args) {

        //definitions
        Scanner input = new Scanner(System.in);
        int age;
        String t_div = "    ";
        String fname,
               lname,
               admission_date,
               disease,
               discharge_date,
               data = "";

        System.out.println("First name:");
        fname = input.next();
        System.out.println("Last name:");
        lname = input.next();
        System.out.println("Admission date:");
        admission_date = input.next();
        System.out.println("Disease:");
        disease = input.next();
        System.out.println("Discharge date:");
        discharge_date = input.next();
        System.out.println("Age:");
        age = input.nextInt();
        // converts int to string
        String str_age = String.valueOf(age);
        insertsContent(fname, lname, admission_date, disease, discharge_date, t_div, age, str_age);
        printContent(data);
    }

    public static void insertsContent(String fname, String lname, String admission_date, String disease, String discharge_date, String t_div, int age, String str_age){
        try {
            if (age <= 12) {
                System.out.println("PEDIATRIC");
                FileWriter myWriter = new FileWriter("pediatric.txt");
                myWriter.write(fname + t_div + lname + t_div + admission_date + t_div + disease + t_div + discharge_date + t_div + str_age + "\n");

                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } else {
                System.out.println("NOT PEDIATRIC");
                FileWriter myWriter = new FileWriter("not_pediatric.txt");
                myWriter.write(fname + t_div + lname + t_div + admission_date + t_div + disease + t_div + discharge_date + t_div + str_age + "\n");
                myWriter.close();
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Something went wrong, please try again.");
        }
    }

    /// tries to print the content
    public static void printContent(String data) {
        
        // printing the content
        try {
            System.out.println("");
            File myObj = new File("pediatric.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (Exception e) {
            System.out.println("Something went wrong, please try again.");
          }
    }// public static void printContent(String data)
    
}// public class A2draft 
