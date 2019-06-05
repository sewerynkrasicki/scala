/*
napisz funkcje generyczną less, która oblicza liczbę wszystkich 
elementów ciągu seq, które są mniejsze(w sensie relacji porządkujacej
leq) od swoich bezpośrednich poprzedników w tym ciągu. W rozwiązaniu
użyć metod operujących ma kolekcjach.
*/
 object Main extends App{
  def less[A](seq: Seq[A])(leq: (A,A)=>Boolean): Int = {
    seq.sortWith(leq).size-1
  }
  val ciag = Seq(5,4,3,2,1,3,5)
  println(less(ciag)(_<_))
}