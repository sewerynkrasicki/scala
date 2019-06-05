import akka.actor.{Actor, ActorRef, ActorSystem, Props}

case class Task(n: Int, serwer: ActorRef)
case class Request(n: Int)
case class Response(n: Int)

class Serwer1 extends Actor
{
  def receive: Receive =
  {
    case Request(n: Int) =>
    {
      if(n%2==0)
      context.sender() ! Response(n * n)
      else {
        val wysylka = context.actorOf(Props[Serwer2], "wysylka")
        wysylka ! Request(n)
      }
    }
  }
}

class Serwer2 extends Actor{
  def receive: Receive = {
    case Request(n: Int) =>
      val klient = context.actorOf(Props[Klient], "klient1")
      klient ! Response(n*n*n)
  }
}
class Klient extends Actor
{
  def receive: Receive =
  {
    case Task(n: Int, serwer: ActorRef) =>
    {
      serwer ! Request(n)
    }
    case Response(n: Int) =>
    {
      println(n)
      context.system.terminate()
    }
  }
}

object Lab10zad2
{
  def main(args: Array[String]): Unit =
  {
    val system = ActorSystem("ActorSys")
    val serwer = system.actorOf(Props[Serwer1], "serwer")
    val klient = system.actorOf(Props[Klient], "klient")
    println("Prosze podac liczbe: ")
    var k = io.StdIn.readInt()
    klient ! Task(k,serwer)

  }
}