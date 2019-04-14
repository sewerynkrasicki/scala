package insertInto.instertInto

object insertInto extends App{
  def insert[A](el: A, seq: Seq[A])(leq: (A,A)=> Boolean): Seq[A] = {
    @annotation.tailrec
    def helper(el: A, seq: Seq[A], out: Seq[A] ): Seq[A]={
      if (seq.isEmpty) out
      else if(leq(el,seq.head)) out++(el+:seq)
      else helper(el, seq.tail, out:+seq.head)
    }
    helper(el,seq,Seq())
  }
  println(insert(2, Seq(1,3,4,5))(_<_))

}
