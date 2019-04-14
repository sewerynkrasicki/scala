def compress[A](s: Seq[A]): Seq[(A, Int)] = {
    @annotation.tailrec
    def helper(inp: Seq[A], out: Seq[(A, Int)]): Seq[(A, Int)] = (inp, out) match {
        case (Seq(), _) => 
            out
        case (głowa +: ogon, Seq()) =>
            helper(ogon, Seq((głowa, 1)))
        case (głowa +: ogon, (el, n) +: reszta) if głowa == el =>
            helper(ogon, (el, n + 1) +: reszta)
        case (głowa +: ogon, _) => 
            helper(ogon, (głowa, 1) +: out)
    }
    helper(s, Seq()).reverse
}
compress(Seq(1,1,1,2,3,3))