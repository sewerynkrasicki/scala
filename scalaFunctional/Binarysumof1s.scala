object zadanie1 extends App{
  println("Podaj liczbe naturalna: ")
  var n = io.StdIn.readInt()
  var x = n.toBinaryString
  var y = x.toInt
  println("To liczba w zapisie binarnym: " +x)
  var i = 0
  while(y!=0) {
    if (y % 2 == 1) {
      i += 1
      y = y / 10
    }
    else y = y / 10
  }
  println("Tyle jest jedynek w zapisie binarnym : " + i)
}