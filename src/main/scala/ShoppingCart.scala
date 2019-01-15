object ShoppingCart extends App{

  def checkout(listFruit:List[String]): Double ={
    var amountApple = 0
    var amountOrange =0
    for(i <-  0 until listFruit.length){
      listFruit(i) match{
        case "Apple" => amountApple += 1
        case "Orange" => amountOrange += 1
      }
    }
    apples(amountApple)+oranges(amountOrange)
  }

  def apples(numApples:Int):Double={
    var totalCost = (numApples/2)*0.60
    if(numApples%2 !=0)totalCost+=0.60
    totalCost
  }

  def oranges(numOranges:Int):Double={
    var totalCost = (numOranges/3)*0.50
    if(numOranges%3 != 0 )totalCost+=(numOranges%3)*0.25
    totalCost
  }

  println(s"Cost is: £${checkout(List("Apple","Orange","Apple","Orange","Orange","Apple","Orange"))}")

}
