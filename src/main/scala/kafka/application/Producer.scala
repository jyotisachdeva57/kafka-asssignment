package kafka.application

import java.util.Properties

import kafka.functionality.model.Person
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

object Producer extends App {

  val topic = "person"
  val listOfPersons = List("jyoti", "nidhi", "kartika", "akansha")
  val props = new Properties()

  props.put("bootstrap.servers", "localhost:9092")
  props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer", "kafka/functionality/serializerdeserialzer/Serializer")

  val producer = new KafkaProducer[String, Person](props)

  for (iterator <- 0 to 3) {
    val key = iterator.toString
    val value = Person(iterator, listOfPersons(iterator))
    val record = new ProducerRecord[String, Person](topic, key, value)
    producer.send(record)
    print(s"data has been sent.")
  }
  producer.close()

}