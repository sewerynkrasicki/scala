/*
Zaimplementuj generyczną funkcje zastępującą wszystkie podciągi
seq składające się z powtarzanego elementu jego pojedynczą kopią
*/

object Main extends App{
  def deStutter[A](seq: Seq[A]): Seq[A] = {
    seq.foldLeft(Seq[A]())((a: Seq[A], b: A) =>
    {
      if(a.isEmpty || a.head!=b) b+:a
      else a
    }).reverse
  }
  println(deStutter(Seq(1,2,3,4,5,1,2,3,1,1,2,3,3,3,3,4)))
}
