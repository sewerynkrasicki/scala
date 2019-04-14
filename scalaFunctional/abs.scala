

object bezwzgledna {
  def main(args: Array[String]): Unit = {
    print("Podaj dlugosc ciagu: ")
    var n = io.StdIn.readInt()
    var tab = new Array[Double](n)
    for (i <- 0 to n-1) {
      print("Podaj " + i + " element: ")
      tab(i) = io.StdIn.readDouble()
    }
    var abs = new Array[Int](2)
    abs(0) = 0
    abs(1) = 1
    for (i <- 0 to n-1)
      {
        for (j <- 0 to n-1)
          {
            if (i != j && Math.abs(tab(i) - tab(j)) < Math.abs(tab(abs(0)) - tab(abs(1)))  ) {
              abs(0) = i
              abs(1) = j
            }
          }

      }
    println("Te liczby to " + tab(abs(0)) + " i " + tab(abs(1)))
    println("Ich odleglosc od siebie to: " + Math.abs(tab(abs(0)) - tab(abs(1))))

  }
}