import java.util.Scanner;

public class FilamentRecord {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //We get input from the user
        String record = input.nextLine(); //We give the input to the record variable and stop it with nextLineMethod
        String material = record.substring(0, 3); //first 3 digits are defining material

        int spool1 = parseInt(record.substring(4, 7)); //These intervals are numbers between "-" 
        int spool2 = parseInt(record.substring(8, 11));//These intervals are numbers between "-" 
        int spool3 = parseInt(record.substring(12, 15));//These intervals are numbers between "-" 
        int spool4 = parseInt(record.substring(16, 19));//These intervals are numbers between "-" 
        int spool5 = parseInt(record.substring(20, 23));//These intervals are numbers between "-" 
        int spool6 = parseInt(record.substring(24, 27));//These intervals are numbers between "-" 
        int total = spool1 + spool2 + spool3 + spool4 + spool5 + spool6; //we got the total for those numbers
        double avg = (double) total / 6; //we got the average for those numbers

        System.out.println("Material: "+material);
        System.out.println("Total filament: "+total+" grams");
        System.out.println("Average per spool: "+avg+" grams");
    }
}
