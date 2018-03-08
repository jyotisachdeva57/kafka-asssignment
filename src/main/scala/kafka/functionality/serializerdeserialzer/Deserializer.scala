package kafka.functionality.serializerdeserialzer

import java.io.{ByteArrayInputStream, ObjectInputStream}

import kafka.functionality.model.Person
import org.apache.kafka.common.serialization.Deserializer


class DeSerializer extends Deserializer[Person] {

  override def configure(configs: java.util.Map[String, _], isKey: Boolean): Unit = {

  }

  override def deserialize(topic: String, bytes: Array[Byte]) = {
    val byteIn = new ByteArrayInputStream(bytes)
    val objIn = new ObjectInputStream(byteIn)
    val obj = objIn.readObject().asInstanceOf[Person]
    byteIn.close()
    objIn.close()
    obj
  }

  override def close(): Unit = {

  }

}