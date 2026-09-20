import java.util.Scanner;

public class FarmerRyan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        for (int i = 0; i < 6; i++) {
            total = total + input.nextInt();
        }

        System.out.println("Ryan has to plant " + total + " beans");
    }
}
