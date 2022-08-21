fun main() {
    val s = checkNotNull(readLine())
    var newNumbersList = mutableListOf<String>()
    var final = 0
    for (i in s.indices) {

        if (s[i].isDigit() && s[i - 1].isLetter()) {
            newNumbersList.add(s[i].toString())
            try {
                if (s[i + 1].isDigit()) {
                    newNumbersList[newNumbersList.lastIndex] += (s[i + 1].toString())
                    println(newNumbersList[newNumbersList.lastIndex])
                } else
                    if (!s[i].isDigit() && s[i + 1].isLetter())
                        newNumbersList.add("1")

            } catch (e: StringIndexOutOfBoundsException) {
                continue
            }
        } else {
            try {
                if (s[i + 1].isLetter()) {
                    newNumbersList.add("1")
                }
            } catch (e: StringIndexOutOfBoundsException) {
                newNumbersList.add("1")
                continue
            }


        }

    }
    for (k in newNumbersList) {
        final += k.toInt()
    }
    println(newNumbersList)
    println(final)
}


