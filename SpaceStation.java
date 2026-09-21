// SpaceStation.java
// WARNING: This code currently contains exactly 32 errors and will not compile!
// Task: Find the errors, fix them, and write a "// FIX:" comment above each fix.

public class SpaceStation {
    public static void main(String[] args) {
       
        System.out.println("=== SPACE STATION RECOVERY INITIATED ===\n");

        // --- MODULE 1: VARIABLES, DATA TYPES & PRINTING (Errors 1-12) ---
        System.out.println("[MODULE 1] Loading variables...");

        int crewMembers = 12; // Deleted the numerical value 1 from the name
        double fuelLevel = 4500.50; // , should have been .
        boolean enginesReady = false; // boolean values should not be written in " "
        int securityLevel = 5; // "i" shoul be small case
       
        int shieldStatus = 100; // The value should be initilized with "int"
       
        int mainPower;
        System.out.println("Main Power: " + mainPower);
       
        int backupPower = 50; // ; should be put at the end of the sentence/code
       
        boolean commsOpen = true; // t should be lower case
       
        System.out.println("System Status Report:"); // "L" should be lower case
        System.out.println("System message: Critical Warning received."); // We have deleted the " " the original was like ->"Critical Warning"
        System.out.println("Using the /n character for a new line."); // "+/n+ "changed from -> /n
       
        int systemId = 101;
        systemId = 102; // There is no need for a new int it is already defined


        // --- MODULE 2: MATH, CASTING & OVERFLOW (Errors 13-24) ---
        System.out.println("\n[MODULE 2] Fuel and Cargo Math...");

        double cargoWeight = 150.75;
        int exactCargoWeight = (int)cargoWeight; // We applied casting
       
        int roundedCargo = (int) (8.9 + 0.5); // parantheses around the numerical values
       
        double cargoDivision = 100 / 3;
       
        int leftoverCargo = 100 % 3; // % instead of /
       
        double multiplication = 5.0 * 2.0;
       
        int speed = 5000;
        speed += 50; // += not =+
       
        speed++; // speed++ not ++speed
       
        int counter = 0;
        counter = counter + 1; // one + not ++
       
        int overload = Integer.MAX_VALUE + 1;
       
        int tempDrop = Integer.MIN_VALUE - 1;
       
        int parenthesisError = (10 + 5 / 2); // End with paranthesis
       
        int crash = 100 / 1; // Logic eror a number can not be divided by 0


        // --- MODULE 3: THE MATH CLASS (Errors 25-32) ---
        System.out.println("\n[MODULE 3] Navigation and Radar...");
       
        int a = 15;
        int b = 2;
        double average = (double)(a + b) / 2; // We did casting
       
        double routeDeviation = Math.abs(-12.5); // not absolute it suppose to be abs
       
        double coordinateSqrt = Math.sqrt(144.0); // similar to the one above
       
        double enginePower = Math.pow(5.0, 3); // We need a value for exponential part as well
       
        double attackPower = Math.pow(2.0, 3.0); // We only have a room for 2 parameters
       
       
        double randomNum = Math.random();
       
        int faultyRandom = (int) Math.random() * 50;
       
        int typeError = Math.abs(-5);

        System.out.println("\n=== ALL SYSTEMS REPAIRED. STATION SAVED! ===");
    }
}
