fun main(){

    // 1

    fun numbers_1(x: Int) {
        if (x % 2 == 0)
            return println("Odd")
        else return println("Even")
    }

    numbers_1(5)


    // 2

    fun numbers_2(x: Int) {
        if (x % 2 == 0)
            return println(x * 4)
        else return println(x * 5)
    }
    numbers_2(5)

    // 3

    fun numbers_3(x: Int) {
        if (x > 0)
            return println(-x)
        else return println(x)
    }
    numbers_3(5)

    // 4

    fun years(year: Int): Int {
        val y = year.toString()
        val centery = when {
            year in 1..100 -> 1
            y.length == 3 && "${y[1]}${y[2]}" != "00" -> "${y[0]}".toInt() + 1
            y.length == 3 && "${y[1]}${y[2]}" == "00" -> "${y[0]}".toInt()
            y.length == 4 && "${y[2]}${y[3]}" != "00" -> "${y[0]}${y[1]}".toInt() + 1
            y.length == 4 && "${y[2]}${y[3]}" == "00" -> "${y[0]}${y[1]}".toInt()
            else -> 0
        }
        return centery
    }
    println(years(1839))
    println(years(1400))
    println(years(1000))
    println(years(45))
    println(years(200))
    println(years(205))

    // 5

    fun minNumber(numbers: IntArray) = println(numbers.minOrNull())
    minNumber(intArrayOf(34, 15, 88, 2))

    // 6

    fun twoMaxNumbers(numbers: IntArray): IntArray {
        var res = IntArray(2)
        numbers.sortDescending()
        res[0] = numbers[1]
        res[1] = numbers[0]
        return res
    }
    println(twoMaxNumbers(intArrayOf(1, 5, 87, 45, 8, 8)))

    //7

    fun numbers_4(numbers: IntArray): IntArray {
        //var res = IntArray(2)
        var res_1 = 0
        var res_2 = 0
        for (n in numbers) {
            if (n >= 0)
                res_1 += 1
            else
                res_2 += n
        }
        return intArrayOf(res_1, res_2)
    }
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)
    println(numbers_4(nums))

    // 8

    fun letters(str: String): Int {
        val vowels = charArrayOf('a', 'e', 'i', 'o', 'u', 'y')
        var res = 0
        for (c in str) {
            if (c in vowels)
                res += 1
        }
        return res
    }
    val str = "agqejvcnjkaaijac nk;s jcimjc msmasc"
    println(letters(str))

    // 9

    fun middleOfStr(str: String): String {
        val res = when {
            str.count() % 2 == 0 -> "${str[str.count()/2 - 1]}${str[str.count()/2]}"
            str.count() % 2 == 1 -> "${str[str.count()/2]}"
            else -> return ""
        }
        return res
    }
    println(middleOfStr("test"))
    println(middleOfStr("student"))
    println(middleOfStr("A"))

    //10

    fun multiplicationTable(n: Int): Array<IntArray?> {
        var res = arrayOfNulls<IntArray>(n)
        for (i in (0..res.count()-1)) {
            res[i] = IntArray(n, { k -> (k + 1) * (i + 1)})
        }
        return res
    }
    println(multiplicationTable(3))

}
main()
