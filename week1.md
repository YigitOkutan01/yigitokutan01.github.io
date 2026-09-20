# Week 1 – Introduction to Java
*September 2026*

[← Back to home](README.md)

## Notes
Java is a programming language where every program is built from classes.
The program starts running at the `main` method. Each statement ends with
a semicolon, and code blocks are grouped with curly braces `{ }`.
`System.out.println()` prints text to the screen and moves to a new line.

## Code

```java
// HelloWorld.java
// Prints a greeting and a simple calculation
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");   // prints a message

        int a = 5;
        int b = 7;
        System.out.println("Sum: " + (a + b)); // prints the sum of a and b
    }
}
```

**What it does:** The program prints a greeting. It then stores two numbers
in variables and prints their sum.

**Sample output:**
```
Hello, World!
Sum: 12
```

## Reflection
This week I learned how a Java program is structured and how to print output.
My challenge was that I first wrote `"Sum: " + a + b`, which printed `Sum: 57`
instead of `Sum: 12`. I learned that Java joins the text from left to right,
so I fixed it by putting `(a + b)` in parentheses.

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
