import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class A2_Main {
    public static void main(String[] args) throws IOException, InterruptedException, ParseException {
        // definitions
        Scanner input = new Scanner(System.in);
        A2_Backend a2b = new A2_Backend();
        int     age,
                user_choice,
                run_again = 0;
        String  fname,
                lname,
                admission_date,
                disease,
                discharge_date,
                data = "";
        String  spc = "\t\t";

        do {
            System.out.println("Welcome to Loremer's Hospital DBMS\nHow can I help you today?");
            System.out.println("----------------------------------------------------------------");
            System.out.println("1 - Add new indoor Patient\n2 - List all Patients\n3 - List regular patients\n4 - List pediatric patients\n5 - Exit");
            user_choice = input.nextInt();
            System.out.println("----------------------------------------------------------------");
            switch (user_choice) {
                case 1:
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
                    a2b.add_to_masterlist(fname, lname, admission_date, disease, discharge_date, spc, age, str_age);
                    a2b.insertPatient(fname, lname, admission_date, disease, discharge_date, spc, age, str_age);
                    System.out.println("\n\nRun program again?\n1 = YES\n2 = NO");
                    run_again = input.nextInt();
                    a2b.cls();
                    break;
                case 2:
                    System.out.println("FIRST NAME\t\tLAST NAME\t\tDISEASE\t\tAGE\t\tADMISSION DATE\t\tDISCHARGE DATE");
                    a2b.print_all_patients(data);
                    System.out.println("\n\nRun program again?\n1 = YES\n2 = NO");
                    run_again = input.nextInt();
                    a2b.cls();
                    break;
                case 3:
                    System.out.println("FIRST NAME\t\tLAST NAME\t\tDISEASE\t\tAGE\t\tADMISSION DATE\t\tDISCHARGE DATE");
                    a2b.print_adult_patients(data);
                    System.out.println("\n\nRun program again?\n1 = YES\n2 = NO");
                    run_again = input.nextInt();
                    a2b.cls();
                    break;
                case 4:
                    System.out.println("FIRST NAME\t\tLAST NAME\t\tDISEASE\t\tAGE\t\tADMISSION DATE\t\tDISCHARGE DATE");
                    a2b.print_pediatric_patients(data);
                    System.out.println("\n\nRun program again?\n1 = YES\n2 = NO");
                    run_again = input.nextInt();
                    a2b.cls();
                    break;
                case 5:
                    System.out.println("Closing app...");
                    run_again = 2;
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
        } while (run_again != 2);
    }
}