public class WorkWithNames
{
    public static void main(String[] args)
    {
    /*
    Y
    İ İ
    ĞĞĞ
    İ İ İ İ
    TTTTT

    O
    KK
    UUU
    TTTT
    AAAAA
    NNNNNN
    
    addaki sesli sessizleri bul
    
    Error:
    -System.out.print(name.substring(i,i+1)); and
    System.out.print(surname.substring(a,a+1)); 
    I had used `println` in those parts, but then I fixed it.
    */
    String name = "YİĞİT";
    String surname = "OKUTAN";
    int nameLength = name.length();
    int surnameLength = surname.length();
    
    
    int i = 0;
    while(i < name.length())
    {
	    int j = 0;
	    while(j<=i)
	    {
		    System.out.print(name.substring(i,i+1));
		    j++;
	    }
	    System.out.println();
	    i++;
    }

	System.out.println();

    int a = 0;
    while(a < surname.length())
        {
	    int b = 0;
	    while(b<=a)
	    {
		    System.out.print(surname.substring(a,a+1));
	    	b++;
	    }
	    System.out.println();
	    a++;
        }
        
    System.out.println();

    if(nameLength<surnameLength){
        System.out.println("Your surname is longer then your name.");
    }
    else if(nameLength>surnameLength){
        System.out.println("Your name is longer then your surname.");
        }
    else{
        System.out.println("Your name is at the same lenght as your surname.");
        }
        
            System.out.println();

        String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        String formattedSurname = surname.substring(0, 1).toUpperCase()+ surname.substring(1).toLowerCase();
        System.out.println(formattedName + " " + formattedSurname);

        System.out.println();
    }
}
/*
In this program, I used nested while loops and the substring method to print each letter of my name and surname
as many times as its position, and I learned that using println instead of print inside the inner loop puts every
letter on a new line, which broke the pattern until I fixed it. I also practiced comparing string lengths with
if-else statements and formatting text with toUpperCase and toLowerCase, and I realized that Turkish letters like 
“İ” need special care when changing letter case.
*/
