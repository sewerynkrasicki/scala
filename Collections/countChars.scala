//funkcja licząca ile różnych znaków użyto w napisie

object Main extends App{
  def countChars(str: String): Int = {
    str.toSet.size
  }
  println(countChars("kajak"))
}
