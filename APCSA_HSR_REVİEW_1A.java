I WİLL GİVE MYSELF 10/14 POİNTS, I couldn't do the 2.q part b and i think i have errors on the last question.

1. Quesition
A)

public boolean planTrip()
{
    int rainyDays = 0;

    for (int dayCount = 0; day < getDays(); day++)
    {
        if (getWeather(dayCount).equals("R"))
        {
            if (dayCount < 3)
            {
                return false;  
            }
            rainyDays++;
        }
    }

    double percentRainy = 100 * rainyDays / getDays();
    return percentRainy <= 30.0;
}

B) 
public static int countSunToRain(String weatherString)
{
    int count = 0;

    for (int i = 0; i < weatherString.length(); i++)
    {
        String current = weatherString.substring(i, i + 1);
        String next = weatherString.substring(i + 1, i + 2);

        if (current.equals("S") && next.equals("R"))
     	{
            count++;
        }
    }

    return count;
}

2. Question

A)
int longestRun = 1;
int currentRun = 1;
int i = 1;

while (i < necklace.length())
{
    if (necklace.substring(i - 1, i).equals(necklace.substring(i, i + 1)))
    {
        currentRun++;
        if (currentRun > longestRun)
        {
            longestRun = currentRun;
        }
    }
    i++;
}

B)

boolean isSymmetric = true;
int len = necklace.length();

//I NEED TO WORK ON FİNDİNG SYMETRİCY

C)
int distinctColors = 0;

for (int a = 0; a < necklace.length(); a++)
{
    String color = necklace.substring(a, a + 1);
    boolean seenBefore = false;

    for (int b = 0; b < a; b++)
    {
        if (necklace.substring(b, b + 1).equals(color))
        {
            seenBefore = true;
        }
    }

    if (!seenBefore)
    {
        distinctColors++;
    }
}

D)
double price = necklace.length() * 1.25;

if (isSymmetric)
{
    price *= 2;
}

price += distinctColors * 0.75;

int roundedPrice = (int) price;

String label;
if (isSymmetric || longestRun < 2)
{
    label = "Premium";
}
else
{
    label = "Standard";
}

System.out.println(roundedPrice + label);
