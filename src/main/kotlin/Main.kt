fun main() {
    var x=modulus(55,30)
    println(x)
    passwords()
    passwords()
    user()
    user()

}
//Create and invoke a function that given 2 numbers returns the remainder of their
//division
fun modulus(num1:Int,num2: Int):Int{
    var remainder=num1%num2
    return remainder
}
//Write a program in Kotlin that asks the user to enter a password.
//If the password is "password123", print "Access granted".
//If the password is incorrect, print "Access denied".
fun passwords() {
    print("Enter your password:")
    var password = readLine()
    if (password == "password123") {
        println("Access granted")
    }
    else{
        println("Access denied")
    }
}
//Write a program in Kotlin that asks the user to enter a number and
//prints whether it is even or odd.
fun user(){
    print("Enter your number:")
    var numbers= readlnOrNull()?.toInt() ?:0
//    for (num in numbers){
        if (numbers %2==0){
            println("even")
        }
        else{
            println("odd")
        }
    }


