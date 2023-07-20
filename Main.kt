fun main() {
  val number = Array(5) { i -> i * 1 }
  println("Enter the elements ")
  for (x in 0..4)
  {
    number[x]=readln().toInt()
  }
  for (y in 0..4)
  {
    if(number[y]%2==0)
    {
      println("Even numbers are : ${number[y]}")
    }
  }
}
