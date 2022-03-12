import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A2_Backend {

    // Converts Date input into DATE datatype
    
    // LIST OF ALL PATIENTS
    public void add_to_masterlist(String fname, String lname, String admission_date, String disease, String discharge_date, String spc, int age, String str_age) throws ParseException 
    {
        // Converts the String Date into DATE Datatype
        Date d_admission_date = null;
        Date d_discharge_date = null;
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        if(admission_date != null && admission_date.trim().length() > 0){
            d_admission_date = format.parse(admission_date);
        }else{
            System.out.println("ERROR!");
        }
        if (discharge_date != null && discharge_date.trim().length() > 0){
            d_discharge_date = format.parse(discharge_date);
        }else{
            System.out.println("ERROR!");
        }
        /////////////////////////////////////////////////

        try {
            System.out.println("WRITING TO MASTERLIST");
            FileWriter myWriter = new FileWriter("masterlist.txt");
            myWriter.write(fname + spc + lname + spc + disease + spc + str_age + spc + d_admission_date + spc + d_discharge_date + "\n");
            myWriter.close();
        }
        catch (Exception e) {
            //TODO: handle exception
        }
        
    } // public void add_to_masterlist
    // INSERTS PATIENT
    public void insertPatient(String fname, String lname, String admission_date, String disease, String discharge_date, String spc, int age, String str_age) throws ParseException
    {
        // Converts the String Date into DATE Datatype
        Date d_admission_date = null;
        Date d_discharge_date = null;
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        if(admission_date != null && admission_date.trim().length() > 0){
            d_admission_date = format.parse(admission_date);
        }else{
            System.out.println("ERROR!");
        }
        if (discharge_date != null && discharge_date.trim().length() > 0){
            d_discharge_date = format.parse(discharge_date);
        }else{
            System.out.println("ERROR!");
        }
        /////////////////////////////////////////////////

        try {
            if (age <= 12) {
                System.out.println("Inserting...");
                System.out.println("TYPE: PEDIATRIC");
                FileWriter myWriter = new FileWriter("pediatric.txt");
                myWriter.write(fname + spc + lname + spc + disease + spc + str_age + spc + d_admission_date + spc + d_discharge_date + "\n");
                // TODO: REMOVE THE myWriter.close(); BECAUSE IT'S NOT MEANT TO CLOSE IMMIDIATELY
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            }
            else {
                System.out.println("Inserting...");
                System.out.println("TYPE: NOT PEDIATRIC");
                FileWriter myWriter = new FileWriter("not_pediatric.txt");
                myWriter.write(fname + spc + lname + spc + disease + spc + d_admission_date + spc + d_discharge_date + spc + str_age + "\n");
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
