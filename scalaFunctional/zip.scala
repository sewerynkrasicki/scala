object zadanie5 extends App{
  def zip[A](a: Seq[A], b: Seq[A]): Seq[A] = {
    @annotation.tailrec
    def helper(a: Seq[A], b: Seq[A], c: Seq[A]): Seq[A] = (a,b,c) match{
      case(Seq(),Seq(),_) => c.reverse
      case (g+:o, b,_) if(c.length%2==0) => helper(o,b,g+:c)
      case (a,g+:o,_) if(c.length%2==1) => helper(a,o,g+:c)
    }
    helper(a,b,Seq())
  }
  println(zip(Seq(1,3,5),Seq(2,4,6)))
}