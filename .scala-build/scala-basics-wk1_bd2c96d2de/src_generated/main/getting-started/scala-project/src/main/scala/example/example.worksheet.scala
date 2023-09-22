
package getting$minusstarted.scala$minusproject.src.main.scala.example



final class example$u002Eworksheet$_ {
def args = example$u002Eworksheet_sc.args$
def scriptPath = """getting-started/scala-project/src/main/scala/example/example.worksheet.sc"""
/*<script>*/
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
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object example$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new example$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export example$u002Eworksheet_sc.script as example$u002Eworksheet

