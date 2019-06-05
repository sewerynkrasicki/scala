/*
Napisz generyczną funkcję która zwraca podciąg ciągu seq 
zaczynający się na elemencie o indeksie bIdx i zawierający 
wszystkie elementy o indeksach nie większych niż eIdx.
*/

object Main extends App {

  def subseq[A](seq: Seq[A], bIdx: Int, eIdx: Int): Seq[A] = {
    seq.drop(bIdx).take(eIdx)
  }
  println(subseq(Seq(1,2,3,4,5),2,5))
}
