object cztery extends App {

  def multip[A](a: Seq[A]) :Seq[A] = {
    def helper(a: Seq[A], result : Seq[A]) : Seq[A] ={
      if (a.isEmpty) return result
      if (result.length % 2 == 0) helper(a, result :+ a(0))
      else helper(a.drop(1), result :+ a(0))
    }
    helper(a, Seq[A]())
  }
  print(multip(Seq(1,2,3,4)))
}