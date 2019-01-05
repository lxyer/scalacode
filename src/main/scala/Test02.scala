class Test02 {

}
object Test02{
  def main(args: Array[String]): Unit = {
    val two = 2
    println(two)
    def three () = 1 + 2
    println(three())
    def addOne (m:Int) : Int=m+1
    println(addOne(4))
    println(multiply(2)(2))
    println(sumAllNum(3,4,5))
    val names = Array("chris", "ed", "maurice")
    val capNames = for (e <- names) yield e.capitalize
  }
//  柯里化函数
  def multiply(m:Int)(n:Int): Int=m*n
//  可变长度参数
  def sumAllNum(nums:Int*):Int={
    var sum = 0
    for (num<- nums){
      sum += num
    }
    sum
  }
}

