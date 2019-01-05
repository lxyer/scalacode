class Test01 {

}
object Test01{
  def main(args: Array[String]): Unit = {
    println("Start")
    "Hello world".split(" ").foreach(println)
    //切割,并且去掉空格
    val s = "eggs, milk, butter,    Coco Puffs  "
    s.split(",").map(_.trim).foreach(println)
    //转大写
    val upper = "hello, world".map(c=>c.toUpper)
    val upper1 = "hello, world".map(_.toUpper)

    /**
      * 在一个String上调用.r方法可以创建一个Regex对象，
      * 之后在查找是否含有一个匹配时就可以用findFirstIn，
      * 当需要查找是否完全匹配时可以用findAllIn。
      */
    val numPattern = "[0-9]+".r
    val address = "123 Main Street Suite 101"
    val match1 = numPattern.findFirstIn(address)
    match1.foreach(println)
    val matches = numPattern.findAllIn(address)
    matches.foreach(println)
//    通过一个Regex对象替换字符
    val regex = "H".r
    val result = regex.replaceAllIn("Hello world","J")
    //获取"hello"的第一个字符
    val char= "hello"(0)
    var n = 100
    var i =1
  }
  def add(num1:Int,num2:Int):Int=num1+num2
}
