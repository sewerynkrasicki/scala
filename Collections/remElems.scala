/*
zaimplementuj generyczną funkcję 
usuwającą co k-ty element ciągu seq.
*/

object Main extends App{
  def remElems[A](seq: Seq[A], k: Int): Seq[A] = {
    seq.zipWithIndex.filter(
      (a: (A, Int)) =>
        (a._2 % k) == 0).map((a: (A, Int)) => a._1)
  }
  println(remElems(Seq(1,2,3,4,5,6),2))
  }