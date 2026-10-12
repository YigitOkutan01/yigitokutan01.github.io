import java.util.Scanner;

public class digitDetective
{
    static int count = 0;
    static int oddSum = 0;
    static int max = 0;
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        /* 
         üç sayı girilecek min 4 haneli max 8 teklerin toplamı 10dan 
         büyükse jackpot teklerim toplamı
         en büyük rakamı bul
         sayıyı ters çevir
         bi method yaz palindrom olsun 
         rakamları toplayıp tek bi rakam çıkana kadar devam et
         soldan sağa hep artıyorsa increasing
         çiftleri sil
         armstrong sayısı
        */
        
        int i = sayiAl(1);
        int j = sayiAl(2);
        int k = sayiAl(3);
        
        tekBul(i);
        tekBul(j);
        tekBul(k);
        
        findMax(i);
        findMax(j);
        findMax(k);
        
        System.out.println("Reversed 1: " + tersCevir(i));
        System.out.println("Reversed 2: " + tersCevir(j));
        System.out.println("Reversed 3: " + tersCevir(k));
        
        System.out.println("Digit count: "+count);
        System.out.println("Sum of odds are: "+oddSum);
        System.out.println("Max of the number: "+ max);
        

        System.out.println("Sum of all digits till 1 digit for i is: " + sumOfDigits(i));
        System.out.println("Sum of all digits till 1 digit for j is: " + sumOfDigits(j));
        System.out.println("Sum of all digits till 1 digit for k is: " + sumOfDigits(k));
        
        if (oddSum > 10) {
            System.out.println("JACKPOT! " + oddSum);
        }
        
    }
    public static int sayiAl(int n)
    {
        System.out.println("Enter Number " + n + ": ");
        int number = input.nextInt();

        while (number < 1000 || number > 99999999) {
            System.out.println("Number must be 4-8 digits! Enter Number " + n + " again: ");
            number = input.nextInt();
        }
    return number;
    }
    
    public static void tekBul(int number)
    {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                oddSum += digit;
            }
            count++;
            number = number / 10;
        }
    }
    
    public static void findMax(int number)
    {
        while (number > 0) {
            int digit = number % 10;
            if(max < digit) {
                max = digit;
            }
            number = number / 10; 
        }
    }
    
    public static int tersCevir(int number)
    {
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return reversed;
    }
    
    public static boolean isPalindrom(int number)
    {
        return number == tersCevir(number);
    }
    
    public static int sumOfDigits(int number)
    {
    while (number > 9)
        {      
        int sum = 0;
        while (number > 0) {      
            sum += number % 10;
            number = number / 10;
        }
        number = sum;            
        }
        return number;
    }
}
