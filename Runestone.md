# All of my notes of Runestone:

## Runestone U1P1
An algorithm is a list of steps that solve a problem, one step at a time, and
every Java program is a class with a main method where the code starts, lines
end with semicolons, code goes inside curly braces, and System.out.println
shows text on the screen. A variable is a box that holds a value, and you pick
its type first: int for whole numbers, double for decimals, and boolean for
true or false. Expressions do math with plus, minus, times, divide, and
modulus for the leftover, and the compiler catches mistakes in how you wrote
the code, while errors like dividing by zero or just getting the wrong answer
only appear when you run it.

## Runestone U1P2
The equals sign puts a value into a variable, and the Scanner class lets the
program read what the user types in. Casting changes one type into another,
like (int) to cut off a decimal, and each type holds only a certain range of
numbers, so an int that gets too big overflows. Compound operators like +=
and -= are shortcuts for changing a variable, and ++ and -- add or take away
one. An API is a library of code someone else already wrote, like the Math
class, so you don't have to build everything yourself. 

## Runestone U1P3
A method is a named block of code that only runs when you call it, and
calling one makes the program jump into that method, run it, then come back
to the line right after the call. Procedural abstraction means you can use a
method by knowing what it does without knowing how it was written. A
parameter is a variable in the method header, and an argument is the actual
value you pass in when you call it, so the same method can do its job with
different values.

## Runestone U1P4
A class method belongs to the class itself, so you call it by writing the
class name, a dot, and the method name, like Math.abs(x), without making an
object first. Some methods give a value back, and you can save that value in
a variable or use it right inside another expression. The Math class is a
library that comes with Java and holds useful methods like Math.abs for the
absolute value, Math.pow for powers, Math.sqrt for square roots, and
Math.round to round a decimal to the closest whole number. Math.random gives
a random double from 0 up to but not including 1, so you multiply it and cast
it with (int) to get a random whole number in the range you want.

## Runestone U1P5
A class is like a blueprint and an object is one real thing built from that
blueprint, so the String class can make many different String objects. You
make a new object with the keyword new and the class name, like
Turtle yertle = new Turtle(habitat), and the variable holds a reference that
points to the object instead of holding the object itself. A constructor is
the special method that runs when you say new, and it sets up the object's
starting values, so a class can have more than one constructor that takes
different information. An instance method is called on an object with a dot,
like yertle.forward(), and it works on that one object's own data, which is
why two objects of the same class can give different results from the same
method.

## Runestone U1P6
A String is an object that holds text, and you can make one with a literal 
like "hi" or with new String("hi"). You can join strings with + or +=, but 
Java goes left to right, so "12" + 4 + 3 gives "1243" unless you use parentheses 
to do the math first. Each letter has an index starting at 0, so the last letter
is at length() - 1, and going past that causes an error. You use length() to count 
letters, substring() to grab part of a string, and indexOf() to find something,
which gives -1 if it's not there. Strings are immutable, so methods like toLowerCase()
make a new string you have to save. To compare strings, use equals() or compareTo() 
instead of ==, and remember capital letters count as different.

## Runestone U2P1
An algorithm is a step-by-step process built from three parts: sequencing (steps in order),
selection (choosing a path with if statements), and repetition (repeating steps with loops).
Relational operators like ==, !=, <, >, <= and >= compare values and give a boolean true or
false, but one = assigns a value while two == tests it. For objects, == only checks if two 
variables refer to the same object. The remainder operator % helps test numbers: num % 2 == 0 
means even, num % 2 != 0 means odd, and num % x == 0 means divisible by x. An if statement 
runs its body only when the condition is true, and adding else gives a second path for when 
it’s false. Don’t put a semicolon after if (condition), and always use curly braces because 
Java ignores indentation. With else if, you can choose between three or more paths, and only 
the first true condition runs, so separate ifs without else can overwrite each other or print
more than once. You can also put ifs inside other ifs, and a dangling else always belongs to 
the closest if unless you use braces to change it.

## Runestone U2P2
Logical operators combine boolean expressions: && is true only if both sides are true,
|| is true if at least one side is true (including both), and ! flips true to false. 
Java runs ! first, then &&, then ||, unless parentheses change the order. Both && and
|| use short-circuit evaluation, so Java skips the right side when the left side already 
decides the answer, which can prevent errors like dividing by zero. De Morgan’s Laws say 
!(a && b) is the same as !a || !b, and !(a || b) is the same as !a && !b, and to remove
a ! from a comparison you flip the sign, so < becomes >=. Two expressions are equivalent 
if they give the same result in every case, which you can prove with a truth table. For 
Strings, == checks if two variables refer to the same object, while equals() checks if 
they have the same letters, and putting s != null first in an && avoids a NullPointerException.
A while loop repeats its body as long as its condition is true, but if the condition starts
out false, the body never runs. To write a loop, initialize the loop variable, test it, and 
update it. Forgetting the update causes an infinite loop, and mixing up < and <= causes an off-by-one error.

## Runestone U2P3
A for loop is used when you know how many times you want to repeat something, and it puts
all 3 parts of a loop in one line: the initialization, the Boolean test, and the update, 
separated by semicolons. The initialization only runs once at the start, then the condition 
is checked before every iteration, and the update runs after the whole loop body finishes
and before the condition is checked again. If you start at 0 you usually use <, and if you
start at 1 you use <=, so both versions run the same number of times. You can also count 
backwards, like for (int i = 5; i > 0; i--), but you have to change all 3 parts, including
the test. You can count by other amounts too, like i += 2 to go by 2s. Any for loop can be
rewritten as a while loop and the other way around. With the Turtle, I used a for loop to 
draw shapes, where the number of turns equals the number of sides and each turn is 360 
divided by the number of sides, like 90 for a square, 120 for a triangle, and 72 for a pentagon.
--------------------------------------------------------------------------------------------------------------
## Runestone U2P4
Loops with if statements can find a sum, average, min, max, or how often something happens.
The accumulator pattern sets a variable before the loop, updates it inside, and uses it after, 
and for an average you cast to (double) so you keep the decimal. For a min you start at 
Integer.MAX_VALUE and for a max at Integer.MIN_VALUE. The % operator checks divisibility and
evenness, and % 10 with / 10 lets you get the digits of a number. For strings, a for loop with
substring(i, i+1) visits every letter to count or reverse them, and a while loop with indexOf 
is used for find and replace, like changing “cat” to “dog”.
