package sumaCyfr

object SumaCyfr extends App{
  println("Podaj liczbe, aby obliczyc jej sume cyfr: ")
  var x = io.StdIn.readInt()
  var suma = 0
  while(x!=0){
    suma+=x%10
    x=x/10
  }
  println(suma)

}
