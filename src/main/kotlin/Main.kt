import org.w3c.dom.ranges.Range

fun main() {
        val randomString = "Akirachix"
        val result = randomString(randomString)
        println(result)
    inputPassword("mami7981")
    multiples()
    var y=CurrentAccount(1234,4550.00,"Marrion")
    y.deposit(500.00)
    y.withdraw(300.00)




}

//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
fun randomString(randomy: String): String {
    val firstChar =randomy .first()?.toString()
    val lastChar = randomy.last()?.toString()
    val length = randomy.length
    val beginsVowel = randomy.first() in listOf('a', 'e', 'i', 'o', 'u')

    return "First Character: $firstChar,Last Character: $lastChar,Length: $length,Begins with Vowel: $beginsVowel"
}






//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun inputPassword(password:String){
    var pass="mami7981"
    for (i in 8..16){
        if (i in pass && i in 0..9){
            println("False")
        }
        else{
            println("True")
        }
    }
}



//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
    fun multiples() {
        for (i in 1..1000) {
            if (i % 6 == 0 && i % 8 == 0) {
                println("Bingo")
            } else if (i % 6 == 0 || i % 8 == 0) {
                println(i)
            }
        }
    }

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”

class CurrentAccount(var accountNumber:Int,var balance:Double,var accountName:String) {
    fun deposit(amount: Double): Double {
        var increment = 0
        if (amount < 0) {
            println("balance is $amount")
        } else {
            var y = amount + balance
            return y

        }
    }

    fun withdraw(amount: Double): Double {
        var increment = 0
        if (amount > 0) {
            println("balance is $amount")
        } else {
            var y = amount - balance
            return y

        }
    }
        fun details() {
            println("Account number $accountNumber with balance $balance by $accountName")
        }

}









