fun main() {
    val s = checkNotNull(readLine())
    var stringNumber: String = ""
    var newNumbersList = mutableListOf<String>()
    var final = 0
    for (i in s.indices) {

        if (s[i].isDigit()) {
            newNumbersList.add(s[i].toString())
            try {
                if (s[i + 1].isDigit())
                    newNumbersList[newNumbersList.lastIndex] += (s[i + 1].toString())

            } catch (error: StringIndexOutOfBoundsException) {

            }
        }
    }
    for (k in newNumbersList) {
        final += k.toInt()
    }
    println(final)
}


