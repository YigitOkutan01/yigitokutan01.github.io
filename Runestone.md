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
