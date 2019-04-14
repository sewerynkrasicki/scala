package czyPalindromem

object czyPalindrom extends App{
  println("podaj wyraz: ")
  var tab = io.StdIn.readLine()
  var tab1 = tab.reverse
  if(tab==tab1) println("Jest palindromem")
  else println("nie jest palindromem")

}
