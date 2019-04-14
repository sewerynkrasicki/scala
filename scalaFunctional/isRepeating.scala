object Main extends App{
  //zad sprawdzajace czy dane slowo powtarza się w ciągu
  println("Ile slow chcesz wpisac? : ")
  var n = io.StdIn.readInt()
  var i = 0
  var j = 0
  var k = 1
  var status = 0
  var tab = new Array[String](n)
  while(i<n){
    println("podaj slowo: ")
    tab(i)=io.StdIn.readLine()
    i+=1
  }
  while(j<n && status==0){
    while(k<n){
      if(tab(j)==tab(k)) status = 1
      else status = 0
      k+=1
    }
    j+=1
  }
  if(status==1) println("tak")
  else println("nie")
}
