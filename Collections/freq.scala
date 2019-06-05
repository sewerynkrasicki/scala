/*
zdefiniuj generyczną funkcję
wyliczającą częstotliwość występowania poszczególnych elementów w ciągu seq. 
Przykładowo, dla seq = Seq("a","b","a","c","a") wynikiem powinno być odwzorowanie Map("a" → 3, "b" → 1, "c" → 1).*/

object Main extends App{
  def freq[A](seq: Seq[A]): Map[A, Int]={
    seq.groupBy(identity).map(a=>(a._1,a._2.length))
  }
  println(freq(Seq(1,2,3,4,5,6,1,1,1,1,2,3,4,5,5,5)))
}
