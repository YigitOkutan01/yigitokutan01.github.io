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
An algorithm is a step-by-step process for solving a problem, and it can be written 
in plain English, pseudocode, or code. Every algorithm is built from three parts: 
sequencing, selection, and repetition. Sequencing means the steps run one after
another in order. Selection means the program chooses which steps to run based 
on a true or false condition, like an if statement. Repetition means some steps
repeat until a condition changes, like a loop. Combining these three, you can write
an algorithm for almost any problem.

## Runestone U2P2
A boolean expression is something that evaluates to true or false. Relational operators
like ==, !=, <, >, <= and >= compare values, but Java only uses < and > with numbers, 
not strings. One = assigns a value while two == tests it without changing anything. 
With primitive types like int, == compares the actual values, but with objects it only
checks if two variables refer to the same object, which are called aliases. The remainder
operator % is useful for testing numbers: num % 2 == 0 means even, num % 2 != 0 means odd,
and num % x == 0 means divisible by x. Don’t use num % 2 == 1 to check for odd numbers,
because negative odd numbers give -1.

## Runestone U2P3
An if statement is a selection statement that changes the normal top-to-bottom order of the 
code. A one-way selection (if) runs its body only when the condition is true and skips it when
it’s false. A two-way selection (if-else) runs the if body when the condition is true and the 
else body when it’s false, so you need at least two test cases to check both paths. Always use
curly braces, because Java ignores indentation and only looks at the braces. Don’t put a semicolon
after if (condition), and don’t use = instead of == in the condition. Separate if statements are 
each checked on their own, so a variable changed by one if can affect the next one.

## Runestone U2P4
Nested if statements are ifs placed inside other ifs, and the inner if is only checked when the outer
if is true. A multi-way selection (if-else-if) lets you choose between three or more paths, and only 
the first condition that is true runs. If none are true, the final else runs. Without the else, separate
ifs can all run, so a value might get overwritten or print more than once, like a score of 93 ending up
as a “D”. The order of the conditions matters, so check the most specific or highest values first. A 
dangling else always belongs to the closest if, no matter how it is indented, unless you use curly
braces to attach it to a different if.

## Runestone U2P5
Logical operators let you combine boolean expressions. && (and) is true only if both sides are true, 
|| (or) is true if at least one side is true, and ! (not) flips true to false. In Java, || is inclusive,
so it’s also true when both sides are true. && is often used to check if a number is in a range, like 
score >= 0 && score <= 100, while || is often used to catch values that are out of range on either end.
Java runs ! first, then &&, then ||, unless parentheses change the order. Both && and || use short-circuit
evaluation: if the left side of && is false, or the left side of || is true, Java skips the right side. 
This can prevent errors, like dividing by zero. Truth tables show every combination of true and false for an expression.

## Runestone U2P6
Two boolean expressions are equivalent if they give the same result in every case, and you can prove 
this with a truth table. De Morgan’s Laws show how to simplify a negated expression: !(a && b) is the 
same as !a || !b, and !(a || b) is the same as !a && !b. In other words, move the ! inside and && becomes
||, || becomes &&. To remove a ! from a comparison, flip the sign: == becomes !=, < becomes >=, and > becomes <=.
For objects like Strings, == checks if two variables refer to the same object, while equals() checks if 
they have the same characters in the same order. Using new always creates a separate object, so two new
Strings with the same text are equal with equals() but not with ==. You can compare an object to null 
with == or !=, and putting s != null first in an && avoids a NullPointerException.

## Runestone U2P7
A loop repeats code, and a while loop keeps running its body as long as its condition is true. The condition is checked before every iteration, so if it starts out false, the body never runs. Writing a loop takes three steps: initialize the loop variable before the loop, test it in the loop header, and update it at the end of the loop body. Forgetting the update creates an infinite loop that never stops, and using < when you meant <= (or the other way around) causes an off-by-one error, where the loop runs one time too many or too few. Trace tables help you follow a variable’s value through each iteration. While loops are especially useful when you don’t know how many times to repeat, like an input-controlled loop that stops when the user types a sentinel value such as “Bye”. Whenever you notice repeated code, you can usually replace it with a loop.
