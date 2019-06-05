/* 
Korzystając z operacji udostępnianych przez kolekcje trawersowalne zdefiniuj generyczną funkcję
która w ciągu seq zamienia kolejnością elementy o indeksach n + 1 oraz n gdzie n przebiega liczby parzyste: 0,2,4,6,… 
*/

object Main extends App{
  def swap[A](seq: Seq[A]): Seq[A] = {
    seq.zipWithIndex.map{
      case(key,value)=> if (value%2==0) (key,value+1) else (key,value-1)
    }.sortBy(_._2).map(_._1)
  }
  println(swap(Seq(1,2,3,4,5)))
}
