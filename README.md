# RPNCalculator
Greg's version of the RPN Calculator assignment

# Simple RPN Calculator
Your assignment is to create a simple RPN calculator in Java using the generic Stack class.

## Assignment details
The package name should be ssa (all lower characters)
The class name should be RPNCalculator (exact case)

Please be detailed about this. It will help me in grading.

When submitting the assignment, create a new folder called Day4 in your Git repository, add and commit then push to GitHub. Get the link to the source file and paste it into the assignment link. No comments are needed.

## What is RPN?
RPN stands for Reverse Polish Notation is a way of calculating that looks weird to most, but allow calculations to be done without worrying about parenthases. It does this by changing the order that operands (numbers) and operators (plus, minus, times, divide) are ordered. The general order is: OPERAND OPERAND OPERATOR (i.e. two numbers followed by a plus sign). So to add the numbers 1 and 2 using RPN, it would be entered:

1<enter>
2<enter>
+<enter>
3 {answer}

While RPN notation is harder to us, it is easier to create a program using it.

## The Stack class
A stack is a data structure that manages data using a last in; first out mechanism meaning whatever the last thing you put into the stack is the first thing you get out of it.

Operating on a stack involved putting things on and taking things off the stack. You "push" onto the stack and you "pop" off the stack. Note that when you pop, the item is removed from the stack.

Think of a stack of plates as a buffet. When the staff puts clean plates out, when you get a plate, you get the last one which is on the "top" of the stack. And when you do get that top plate, it is removed from the stack. If the staff brings out one more clean plate and puts it on the stack of plates, the next person who gets a plate gets it from the top of the stack.

Because this assignment is going to model a calculator, it won't surprise you that the data that will be stored and retrieved in our stack will be integers. In fact, the basic calculator only has to deal with single digit numbers zero (0) thru nine (9).

## What to do?
In your program, you'll start by declaring a variable that is an array of single characters (type char). It will start with two numbers then have a symbol which will be either a plus (+), minus (-), times (*), or divide (/). Here's what it may look like:

`char[] problem = new char[] {'1','2','+'};`

You should start by displaying for the user (me) the contents of "problem" or whatever you call it. All I need is something like:

Calculating 1,2,+

This set of characters will add the numbers 1 and 2; Once the sum is calculated, it should be pushed onto the stack. When our "problem" variable runs out of characters, we should have one value on the stack which is the answer. It should be pulled from the stack and printed out. I nice output for the answer might look like this:

Calculating 1,2,+. Answer is 3.

Once that's done, the program ends.

## Some things you may need
Because we're putting the numbers in as type char, we'll want to turn them into ints so they are easy to add and subtract. The Java library provides an easy way for us to turn a number of type char into an int. It is `int Character.getNumericValue(ch)`. This method returns an integer version of the number stored as a char. _It is the int that you want to store and retrieve to/from the stack._

Here is how you define a stack that will hold integers:
java.util.Stack<Integer> aStack = new java.util.Stack<Integer>();

Here is an example of getting a value from the stack. You call the `pop()` method:
`int anInt = aStack.pop();`

Here is an example of pushing a new value onto the stack. You call the `push(..)` method where the value in the parens is what gets pushed onto the stack.
`aStack.push(7);`

# Extra Credit
Change your program so that it can use a regular string as input with the problem. It means you'll have to iterate over each character in the string.

Create an ArrayList of strings which will result in multiple calculations.

Dream up a way to allow your calculator to work with input numbers with more than a single digit.
