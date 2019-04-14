object piec extends App {

  def unzip[A](a: Seq[A]) : (Seq[A], Seq[A]) = {
    def helper(a: Seq[A], resultA: Seq[A], resultB: Seq[A]): (Seq[A], Seq[A]) = a.length match {
      case 0 => return (resultA, resultB)
      case _ =>  {
        if (a.length % 2 == 0)helper(a.drop(1),resultA :+ a(0), resultB)
        else helper(a.drop(1),resultA, resultB :+ a(0))
      }

      }
    helper(a,Seq[A](),Seq[A]())
    }
  print(unzip(Seq(1,2,3,4,5,6)))
  }