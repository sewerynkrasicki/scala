/*Napisac funkcje generyczna second[A](seq: Seq[A])(leq:(A,A)=>Boolean):A, ktora
w ciagu (roznowartosciowym) seq znajduje drugi co do wielkosci element( w sensie realcji
porzadkujacej leq). W rozwiazaniu uzyc metod operujacych na kolekcjach.
*/

object Main extends App{
  def second[A](seq: Seq[A])(leq:(A,A)=>Boolean):A ={
    seq.sortWith(leq)(1)
  }
  val ciag = Seq(5,4,3,2,1,6,7)
  println(second(ciag)((a,b)=>a>b))
}

