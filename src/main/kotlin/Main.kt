open class Data() {
    val panjang: Int = 8

    open fun print(){
        println("")
    }
}

class BentukPola():Data(){
    fun piramid() {
        var k: Int = 0
        for (i in 1..panjang) {
            for (n in 1..panjang - i) {
                print("  ")
            }
            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            println()
            k = 0
        }
    }

    fun piramidTerbalik(){
        for (i in panjang downTo 1) {
            for (l in 1..panjang - i) {
                print("  ")
            }
            for (l in i until 2 * i) {
                print("* ")
            }
            for (l in 0 until i - 1) {
                print("* ")
            }
            println()
        }
    }

    fun belahKetupat(){
        var space: Int = panjang - 1
        var x = 1
        var a: Int

        while (x <= panjang) {
            a = 1
            while (a <= space) {
                print(" ")
                a++
            }
            space--
            a = 1
            while (a <= 2 * x - 1) {
                print("*")
                a++
            }
            println("")
            x++
        }
        space = 1
        x = 1
        while (x <= panjang - 1) {
            a = 1
            while (a <= space) {
                print(" ")
                a++
            }
            space++
            a = 1
            while (a <= 2 * (panjang - x) - 1) {
                print("*")
                a++
            }
            println("")
            x++
        }
    }

    fun polaX(){
        val count: Int = panjang * 2 - 1
        for(u in 1..count){
            for(m in 1..count){
                if(m==u || (m==count - u + 1))
                {
                    print("*");
                }
                else
                {
                    print(" ");
                }
            }

            println("")
        }

    }

    fun segiTiga(){
        for (o in 1..panjang) {
            for (n in 1..o) {
                print("* ")
            }
            println()
        }
    }

    override fun print() {
        super.print()
        println("Selesai")
    }
}

fun main() {
    val obj = BentukPola()
    obj.piramid()
    println()
    obj.piramidTerbalik()
    println()
    obj.polaX()
    println()
    obj.belahKetupat()
    println()
    obj.segiTiga()
}
