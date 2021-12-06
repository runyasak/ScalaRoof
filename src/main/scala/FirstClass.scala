import scalaj.http.{Http, HttpResponse}
import scala.xml.XML

object FirstClass extends App {
  val response: HttpResponse[String] =
    Http("http://feeds.bbci.co.uk/news/world/rss.xml")
      .timeout(connTimeoutMs = 2000, readTimeoutMs = 5000)
      .asString
  val xml = XML.loadString(response.body)
  val titleNodes = (xml \\ "item" \ "title")
  val headlines = for {
    t <- titleNodes
  } yield t.text
  headlines.foreach(println)
}
