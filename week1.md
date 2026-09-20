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

*Sources: class slides, Oracle Java Tutorials.*
