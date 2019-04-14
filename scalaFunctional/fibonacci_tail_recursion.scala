package fibonacci_rek_ogon

object fibonacci_rek_ogon extends App{
  def fib(n: Int): Int = {
    @annotation.tailrec
    def helper(n: Int,a: Int = 0, b: Int = 1): Int = {
      if (n==0) a
      else if (n==1) b
      else helper(n-1,b,a+b)
    }
    helper(n)
  }
  println(fib(6))
}
