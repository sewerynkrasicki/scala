object zadanie4 extends App {
  def everysec[A](a: Seq[A]): Seq[A] = {
    @annotation.tailrec
    def helper(seq: Seq[A], out: Seq[A]): Seq[A] = {
      if (seq.isEmpty) out.reverse
      else if (seq.length % 2 == 1) helper(seq.tail, seq.head +: out)
      else helper(seq.tail, out)
    }

    helper(a, Seq())
  }

  println(everysec(Seq(1, 2, 3, 4, 5)))
}