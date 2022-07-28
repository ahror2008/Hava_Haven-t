package Main

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Sonni kiriting")
    val b = scanner.nextInt()
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var isHave = false
    for (i in array.indices) {
        isHave = true
        break
    }

        if (isHave) {
            println( "Bor")
        }else  {
            println("Yo'q")
        }
    }



