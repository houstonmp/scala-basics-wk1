1 + 1

val x = 42

x * x

// Fibonacci Sequence def defines a function
// declarations of type are done w/ : special character
// if statements don't require return statements but a then statement is required for the result of the if / then
// No need for curly braces
// instead of tabs two spaces are used for indents
// return statement type is declared to the right of the function not the left

def fib(n: Int): Int = 
  def fibIter(i: Int,a: Int,b: Int): Int =
    if i == n then a else fibIter(i+1, b, a+b)
  fibIter(0, 0, 1)
fib(10)

def fib2(n: Int): Int =
  def fibIter(i: Int, a: Int, b: Int): Int =
    if i == n then a else fibIter(i+1, b, a+b)
  fibIter(0, 0, 1)
fib2(29)