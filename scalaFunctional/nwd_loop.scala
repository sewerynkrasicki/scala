package nwd_loop

object nwd_loop extends App {
  println("podaj pierwsza liczbe: ")
  var a = io.StdIn.readInt()
  println("podaj druga liczbe: ")
  var b = io.StdIn.readInt()
  while (a != b) {
    if (a > b)
      a = a - b
    else
      b = b - a
  }
  println("NWD to "+a)


}
