import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A2_Backend {

    // Converts Date input into DATE datatype
    public void cnvt_to_date_type(Scanner input, String admission_date, String discharge_date)throws ParseException
    {
        Date date1=null;
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter check-in date (gg/aa/yy):");
        String cinput = input.nextLine();
        if(null != cinput && cinput.trim().length() > 0){
             date1 = format.parse(cinput);
        }
    }
    
    // LIST OF ALL PATIENTS
    public void add_to_masterlist(String fname, String lname, String admission_date, String disease, String discharge_date, String t_div, int age, String str_age) 
    {
        String concat_patient = fname + t_div + lname + t_div + admission_date + t_div + disease + t_div + discharge_date + t_div + str_age;
        try {
            System.out.println("WRITING TO MASTERLIST");
            FileWriter myWriter = new FileWriter("masterlist.txt");
            myWriter.write( concat_patient + "\n");
        }
        catch (Exception e) {
            //TODO: handle exception
        }
        
    } // public void add_to_masterlist
    // INSERTS PATIENT
    public void insertPatient(String fname, String lname, String admission_date, String disease, String discharge_date, String t_div, int age, String str_age) 
    {
        String concat_patient = fname + t_div + lname + t_div + admission_date + t_div + disease + t_div + discharge_date + t_div + str_age;
        try {
            if (age <= 12) {
                System.out.println("Inserting...");
                System.out.println("TYPE: PEDIATRIC");
                FileWriter myWriter = new FileWriter("pediatric.txt");
                myWriter.write(concat_patient + "\n");
                // TODO: REMOVE THE myWriter.close(); BECAUSE IT'S NOT MEANT TO CLOSE IMMIDIATELY
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            }
            else {
                System.out.println("TYPE: NOT PEDIATRIC");
                FileWriter myWriter = new FileWriter("not_pediatric.txt");
                myWriter.write(concat_patient + "\n");
                // TODO: REMOVE THE myWriter.close(); BECAUSE IT'S NOT MEANT TO CLOSE IMMIDIATELY
                myWriter.close();
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Something went wrong, please try again.");
        }
    } // public void insertPatient

    // CLEARS SCREEN
    public void cls() throws IOException, InterruptedException 
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } // public void cls()
}
