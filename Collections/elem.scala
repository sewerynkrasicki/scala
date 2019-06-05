/*
Napisac funkcje generyczna elem[A](seq: Seq[(A, A)]): Seq[A], ktora na podstawie ciagu
par elementow tworzy ciag tych wartosci elementow, ktore wystepuja w ktorejkolwiek parze
(na pierwszej lub drugiej pozycji). W rozwiazaniu uzyc metod operujacych na kolekcjach.
Uwaga: kazda wartosc w wyniku ma wystepowac tylko raz.
*/

object Main extends App{
  def elem[A](seq: Seq[(A, A)]): Seq[A] ={
    (seq.unzip._1 ++ seq.unzip._2).groupBy(identity).unzip._1.toSeq

  }
     val ciag = Seq( (1,2), (2,2), (3,1), (4,7), (7,4)  )
  println(elem(ciag))
  println(elem(ciag).sorted)
}
