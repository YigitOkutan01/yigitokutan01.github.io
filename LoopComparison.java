public class LoopComparison
{
    public static void main(String[] args)
    {
     //Print numbers from 1-20 skipping multiples of 3
     
    for(int i = 1; i <= 20; i++)
        {
        if(i % 3 != 0)
            {
                System.out.println("Number: " + i);
            }
        }
    }
}
