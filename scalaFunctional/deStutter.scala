package destutter

object deStutter extends App {
  def deStutter[A](seq: Seq[A]): Seq[A] = {
    @annotation.tailrec
    def helper(seq: Seq[A], out: Seq[A]): Seq[A] = seq.length match {
      case 2 => {
        if(seq(0)==seq(1)) out:+seq(0)
        else out:+seq(0):+seq(1)
      }
      case 1 => {
        out:+seq(0)
      }
      case _ => {
        if(seq(0)==seq(1)) helper(seq.tail,out)
        else helper(seq.tail, out:+seq(0))
      }

    }
    helper(seq, Seq())
  }
  println(deStutter(Seq('b','b','b','a','a','c','c','d','a','a')))

}
