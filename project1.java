public class project1
{
    static String totalText = "";
    static String undoText = "";

    public static void main(String[] args) 
    {
        x("Efe");
        x("Yigit");
        x("Yig#");
    }

    public static void u()
    {
        if(totalText.length() == 0)
        {
            System.out.println("There is nothing to undo.");
        }
        else
        {
            int i = totalText.indexOf("#");
            undoText = totalText.substring(0,i);
            totalText = undoText;
            System.out.println(totalText);
        }
    }

    public static void x(String textAdd)
    {
        if(totalText != textAdd && textAdd.indexOf("#") == -1)
        {
            totalText += " " + textAdd;  
            System.out.println(totalText);
        }
        else
        {
            System.out.println("We cant add same word or it cant contain # so: " + totalText);
        }
    }
      
        public static void r()
    {
        
    }
}