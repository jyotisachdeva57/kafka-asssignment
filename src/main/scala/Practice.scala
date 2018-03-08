import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
//
//object CustomProducer extends App {
//val properties = new Properties()
//  properties.put("bootstrap.servers","localhost:9092")
//  properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
//  properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
//  //keys decide partition
//  val producer = new KafkaProducer[String,String](properties)
//  val record = new ProducerRecord[String, String]("test1","key","value")
//  System.out.print("message has been sent")
//  producer.send(record)
//  producer.close()
//
//}
//

import java.util.Properties

import org.apache.kafka.clients.consumer.KafkaConsumer
import scala.collection.JavaConverters._
//object customConsumer extends App {
//  val properties = new Properties()
//  properties.put("enable.auto.commit","false")
//  properties.put("auto.offset.reset","earliest")
//  properties.put("bootstrap.servers","localhost:9092")
//  properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
//  properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
//  properties.put("group.id","abc")
//  val consumer = new KafkaConsumer[String, String](properties)
//  consumer.subscribe(java.util.Collections.singletonList("test1"))
//  System.out.print("message received")
//  while (true) {
//    val records=consumer.poll(5000)
//    for (record <- records.asScala)
//      println(record.key())
//  }
//}
