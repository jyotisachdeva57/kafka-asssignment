package kafka.functionality.model

case class Person(id: Int, name: String){
  override def toString: String = s"id: $id Name: $name \n"
}