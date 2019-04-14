// Seq (ang. sequence – ciąg)
// Seq(1,1,1,2,3,3,4,1,2,3,3)  ==> Seq(1,2,3,4,1,2,3)
def deStutter[T](s: Seq[T]): Seq[T] = {
    @annotation.tailrec
    def helper(inp: Seq[T], out: Seq[T]): Seq[T] = (inp, out) match {
        case (Seq(), _) => out
        case (pierwszy +: reszta, Seq()) =>
            helper(reszta, Seq(pierwszy))
        case (pierwszy +: reszta, el +: ogon) if pierwszy == el =>
            helper(reszta, out)
        case (pierwszy +: reszta, el +: ogon) =>
            helper(reszta, pierwszy +: out)
    }
    helper(s, Seq()).reverse
}

deStutter(Seq(1,1,1,2,3,3,4,1,2,3,3))
deStutter(Seq('a','a','b','c','c'))