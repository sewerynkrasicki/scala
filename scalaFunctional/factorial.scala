package factorial

object factorial extends App{
  def factorial(n: Int): Int = {
    if(n==0) 1
    else if(n==1) 1
    else n*factorial(n-1)
  }
  println(factorial(5))
  def factorial_ogon(n: Int): Int ={
    def helper(n: Int, acc: Int = 1): Int = {
      if(n==0) acc
      else helper(n-1, n*acc)

    }
    helper(n)

  }
  println(factorial_ogon(5))
}
