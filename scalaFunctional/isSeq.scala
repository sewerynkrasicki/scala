package rosnacy

object rosnacy_malejacy_ciag_n extends App{
  println("Jak dlugi ma byc ciag? ")
  var n = io.StdIn.readInt()
  var ciag = new Array[Int](n)
  var i = 0
  while(i<n){
    println("Podaj "+(i+1)+" liczbe do ciagu")
    ciag(i)=io.StdIn.readInt()
    i+=1
  }
  var k=0
  var j = 0
  var status = true
  while(k<n-1){
    j = k+1
    if(ciag(k)<ciag(j)) status = true
    else status = false
    k+=1
    j+=1
  }
  if(status==true) println("ciag jest rosnacy")
  else println("ciag nie jest rosnacy")



}
