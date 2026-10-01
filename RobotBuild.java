import java.util.Scanner;

public class RobotBuild
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in); //We get input from the user
        String code = input.nextLine(); //We give the input to the code variable and stop it with nextLineMethod
        
        //Block sequence initials
        String initial1 = code.substring(0,1);
        String initial2 = code.substring(3,4);
        String initial3 = code.substring(6,7);
        String initial4 = code.substring(9,10);
        String initial5 = code.substring(12,13);
        System.out.println("Block sequence: "+initial1+initial2+initial3+initial4+initial5);
        
        //Studs sequence
        String stud1 = code.substring(1,3);
        String stud2 = code.substring(4,6);
        String stud3 = code.substring(7,9);
        String stud4 = code.substring(10,12);
        String stud5 = code.substring(13,15);
        System.out.println("Studs sequence: "+stud1+"-"+stud2+"-"+stud3+"-"+stud4+"-"+stud5);
        
        //Reversed Instruction
        String inst1 = code.substring(0,3);
        String inst2 = code.substring(3,6);
        String inst3 = code.substring(6,9);
        String inst4 = code.substring(9,12);
        String inst5 = code.substring(12,15);
        System.out.println("Reversed Instruction: " +inst5+inst4+inst3+inst2+inst1);
        
        //Summary
        System.out.println("Summary: "+initial1+initial5);
    }
}
