/*
napisz funkcje first, która na podstawie ciągu ciągów elementów
tworzy ciąg tych elementów, które występują na początkowych
pozycjach kolejnych ciągów będących elementami seq
*/

object Main extends App{
  def first[A](seq: Seq[Seq[A]]): Seq[A] ={
    seq.map(_.head)
  }
  val ciag1 = Seq(1,2,3,4,5)
  val ciag2 = Seq(2,3,4,5,6)
  val ciag3 = Seq(3,4,5,6,7)
  println(first(Seq(ciag1,ciag2,ciag3)))
}