import java.util.Scanner;

public class GetItIntoGear {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        String[] gears = line.split("T");  

        int first = Integer.parseInt(gears[0]);
        int last = Integer.parseInt(gears[gears.length - 1]);

        double revs = 10.0 * first / last;
        revs = Math.round(revs * 100.0) / 100.0;  

        if (revs == (int) revs) {
            System.out.println((int) revs);
        } else {
            System.out.println(revs);
        }

        if (gears.length % 2 == 1) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }
    }
}
