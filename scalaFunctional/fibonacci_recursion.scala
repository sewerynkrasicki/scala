package fibonacci

object fibonacci_rek_zwykla extends App{
  def fib(n: Int): Int = {
    if (n==0) 0
    else if (n==1) 1
    else fib(n-2)+fib(n-1)
  }
  println(fib(6))


}
