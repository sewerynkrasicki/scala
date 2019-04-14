package isOrdered

object isOrdered extends App{
  def isOrder[A](seq: Seq[A])(leq: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def helper(seq: Seq[A]): Boolean = {
      if (seq.isEmpty || seq.length==1) true
        //jezeli sa ze soba w (a<b) to wykonuj dalej
      else if(leq(seq.head,seq.tail.head)) helper(seq.tail)
      else false
    }
    helper(seq)
  }
  println(isOrder(Seq(1,2,3,4))(_<_))
  println(isOrder(Seq(4,3,2,1))(_<_))


}
