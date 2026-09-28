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
