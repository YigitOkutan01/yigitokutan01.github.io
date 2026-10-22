public class HalfDiamond
{
    public static void main(String[] args)
    {
        //Write a Java program using nested for loops to print the following pattern:
        //        1 
        //      121
        //    12321 
        //  1234321 
        //123454321
        //Both use for and while loop
     
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            
        for (int s = 1; s <= 2 * (n - i); s++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }

        for (int j = i - 1; j >= 1; j--) {
            System.out.print(j);
        }
            System.out.println();
        }
        
    }
}
