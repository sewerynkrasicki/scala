  def nieparzyste(t: Array[Int]): Array[Int] = {
    @annotation.tailrec
    def helper(t: Array[Int], result: Array[Int]): Array[Int] = {
      if (t.isEmpty) result
      else {
        if (t(0) % 2 != 0) helper(t.drop(1), result :+ t(0))
        else helper(t.drop(1), result)
      }
    }
    helper(t, Array.emptyIntArray)
  }
  println(nieparzyste(tab).mkString("[", ",", "]"))