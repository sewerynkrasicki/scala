def applyForAll[A,B](s: Seq[A], f: A => B): Seq[B] = {
    @annotation.tailrec
    def helper(inp: Seq[A], out: Seq[B]): Seq[B] = inp match {
        case Seq() => out
        case głowa +: ogon => helper(ogon, f(głowa) +: out)
    }
    helper(s, Seq()).reverse
}
applyForAll(Seq(1,2,3), (n: Int) => "#" * n)