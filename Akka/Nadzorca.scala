/*Napisac program uruchamiajacy 3 aktorow: nadzorce i 2 wykonawcow, gdzie nadzorca generuje
ciag n losowych liczb calkowitych( wartosc n podaje uzytkownik programu)
i wysyla je naprzemiennie do wykonawcow, ktorzy sprawdzaja, czy otrzymana liczba
jest parzysta, czy nieparzysta i wyswietlaja ja wraz z odpowiedzia*/
import akka.actor.{Actor, ActorSystem, Props}

import scala.util.Random

case class task(n: Int)

class Nadzorca extends Actor{
  def receive: Receive = {
    case task(n: Int) =>
      val los = new Random()
      val pierwszy = context.actorOf(Props[Wykonawca], "pracownik1")
      val drugi = context.actorOf(Props[Wykonawca], "pracownik2")
      var x = 0
      while(x<n){
        if(x%2==0)
          pierwszy ! los.nextInt()
        else
          drugi ! los.nextInt()
        x=x+1
      }
      if(x==n) context.system.terminate()
  }
}
class Wykonawca extends Actor{
  def receive: Receive ={
    case msg: Int =>
      if(msg%2==0) println(msg.toString()+ " parzysta")
      else println(msg.toString()+ " nieparzysta")
  }
}

object Main extends App{

  val system = ActorSystem("sys")
  val szef = system.actorOf(Props[Nadzorca], "Szef")
  szef ! task(5)