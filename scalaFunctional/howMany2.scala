object trzy extends App {

  def dzielenie(a: Int): Int = {
    def helper(a: Int, acc: Int): Int = {
      if (a % 2 == 0 && a !=0) helper(a/2, acc+1)
      else acc
    }
    helper(a, 0)
  }
  print(dzielenie(16))
}