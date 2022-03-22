import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A2_Backend {

    // ADDS ALL PATIENTS TO MASTERLIST
    public void add_to_masterlist(String fname, String lname, String admission_date, String disease, String discharge_date, String spc, int age, String str_age) throws ParseException 
    {
        // Converts the String Date into DATE Datatype
        Date d_admission_date = null;
        Date d_discharge_date = null;
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        if(admission_date != null && admission_date.trim().length() > 0){
            d_admission_date = format.parse(admission_date);
        }else{
            System.out.println("ERROR! in admission date input");
        }
        if (discharge_date != null && discharge_date.trim().length() > 0){
            d_discharge_date = format.parse(discharge_date);
        }else{
            System.out.println("ERROR! in discharge date input");
        }
        /////////////////////////////////////////////////

        try {
            //System.out.println("WRITING TO MASTERLIST");
            FileWriter myWriter = new FileWriter("masterlist.txt", true);
            myWriter.write(fname.toUpperCase() + spc + lname.toUpperCase() + spc + disease.toUpperCase() + spc + str_age + spc + d_admission_date + spc + d_discharge_date + "\n");
            myWriter.close();
        }
        catch (Exception e) {
            System.out.println("ERROR! in add to masterlist class");
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
            System.out.println("ERROR! Please follow the format MM-DD-YYYY");
        }
        if (discharge_date != null && discharge_date.trim().length() > 0){
            d_discharge_date = format.parse(discharge_date);
        }else{
            System.out.println("ERROR! Please follow the format MM-DD-YYYY");
        }
        /////////////////////////////////////////////////

        try {
            if (age <= 12) {
                System.out.println("\nInserting...");
                //System.out.println("TYPE: PEDIATRIC");
                FileWriter myWriter = new FileWriter("pediatric.txt", true);
                myWriter.write(fname.toUpperCase() + spc + lname.toUpperCase() + spc + disease.toUpperCase() + spc + str_age + spc + d_admission_date + spc + d_discharge_date + "\n");
                // TODO: REMOVE THE myWriter.close(); BECAUSE IT'S NOT MEANT TO CLOSE IMMIDIATELY
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            }
            else {
                System.out.println("Inserting...");
                //System.out.println("TYPE: NOT PEDIATRIC");
                FileWriter myWriter = new FileWriter("not_pediatric.txt", true);
                myWriter.write(fname.toUpperCase() + spc + lname.toUpperCase() + spc + disease.toUpperCase() + spc + str_age + spc + d_admission_date + spc + d_discharge_date + "\n");
                // TODO: REMOVE THE myWriter.close(); BECAUSE IT'S NOT MEANT TO CLOSE IMMIDIATELY
                myWriter.close();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong, please try again.");
            System.out.println("ERROR: in insertPatient class");
        }
    } // public void insertPatient

    public void print_all_patients(String data) 
    {
        
        // printing the content
        try {
            System.out.println("");
            File myObj = new File("masterlist.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (Exception e) {
            System.out.println("ERROR: in print_All_Content.\nSomething went wrong, please try again.");
          }
    } // public void print_all_patients

    public void print_adult_patients(String data) 
    {
        
        // printing the content
        try {
            System.out.println("");
            File myObj = new File("not_pediatric.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (Exception e) {
            System.out.println("ERROR: in print_adult_patients.\nSomething went wrong, please try again.");
          }
    } // public void print_adult_patients

    public void print_pediatric_patients(String data) 
    {

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
            System.out.println("ERROR: in print_pediatric_patients.\nSomething went wrong, please try again.");
          }
    } // public void print_pediatric_patients

    // CLEARS SCREEN
    public void cls() throws IOException, InterruptedException 
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } // public void cls()
}
