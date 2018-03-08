package kafka.application

import java.util.Properties

import kafka.functionality.model.Person
import org.apache.kafka.clients.consumer.KafkaConsumer
import scala.collection.JavaConverters._
object Consumer extends App {

  val topic = "person"
  val props = new Properties()
  props.put("bootstrap.servers", "localhost:9092")
  props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  props.put("value.deserializer", "kafka/functionality/serializerdeserialzer/Deserializer")
  props.put("group.id", "person-group")
  props.put("auto.offset.reset", "earliest")
  props.put("enable.auto.commit", "false")

  val consumer = new KafkaConsumer[String,Person](props)

  consumer.subscribe(java.util.Collections.singletonList(topic))
  while (true) {
    val records = consumer.poll(5000)
    for (record <- records.asScala)
      println(s"Person's Records:${record.value()}")
  }

}
