fun main(args: Array<String>) {
    val a = 'C'
    println("byte code of $a is ${a.toByte()}")

    val b: String? = ""
    println("length of b is ${b?.length}")
    //b = "new string"
    //println("length of b is ${b.length}")
    when(a) {
        'A' -> {
        }
        'C' -> println("In 2nd condition.")
        else -> {
        }
    }

    var x = 1
    x+=1

    sub(1, 1)
    
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Any, b: Any) {
    if (a is Int && b is Int)
        println("Sub: ${a - b}")
}