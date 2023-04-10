fun main() {
    var x=modulus(55,30)
    println(x)

}
//Create and invoke a function that given 2 numbers returns the remainder of their
//division
fun modulus(num1:Int,num2: Int):Int{
    var remainder=num1%num2
    return remainder
}