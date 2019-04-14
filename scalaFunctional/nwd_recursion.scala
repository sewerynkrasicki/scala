package nwd_rekurencyjnie

object nwd_rekurencyjnie extends App{
  def euklides(a: Int, b: Int) : Int = {
    if(a==b) a
    else if(a>b) euklides(a-b,b)
    else euklides(a,b-a)
  }
  println(euklides(12, 18))

}
