object ShoppingCart extends App{

  def checkout(listFruit:List[String]): Double ={
    var cost:Double = 0.00
    for(i <- 0 to listFruit.length-1){
      listFruit(i) match{
        case "Apple" => cost += 0.25
        case "Orange" => cost +=0.60
      }
    }
    cost
  }

  println(s"Cost is: £${checkout(List("Apple","Orange"))}")
}
