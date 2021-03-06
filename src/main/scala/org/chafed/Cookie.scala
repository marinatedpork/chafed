package org.chafed
import scala.xml.NodeSeq
import java.util.Date



case class Cookie(
    name: Option[String],
    value: String,
    domain: String,
    path: String,
    expires: Option[Date],
    secure: Boolean,
    httpOnly: Boolean
    ) {
  override def toString = name + "=" + value  
}
