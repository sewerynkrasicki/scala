/*
Korzystając z operacji udostępnianych przez kolekcje trawersowalne zdefiniuj generyczną funkcję
która w ciągu seq znajduje wszystkie indeksy, na których występuje podany element el. */

object Main extends App{
  def indices[A](seq: Seq[A], el: A): Set[Int] = {
    seq.zipWithIndex.filter((a: (A,Int)) => a._1 == el).map((a: (A,Int))=>a._2).toSet
  }
  println(indices(Seq(1,2,3,4,1,1,1,2,3,4,5),1))

}
