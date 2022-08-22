fun main() {
    val s = checkNotNull(readLine())
    var newNumbersList = mutableListOf<String>()
    var final = 0
    for (i in 1 until s.length) {

        if (s[i].isDigit() && s[i - 1].isLetter()) {
            newNumbersList.add(s[i].toString())
            for (j in i + 1 until s.length) {
                if (s[j].isLetter() && j - i > 1) {
                    for (k in (i + 1) until j) {
                        if (s[k].isDigit())
                        newNumbersList[newNumbersList.lastIndex] += (s[k].toString())
                    }
                    break
                }
            }
        } else if (s[i].isLetter() && s[i - 1].isLetter()) {
            newNumbersList.add("1")
        }
    }
    if (s[s.lastIndex].isLetter()){
        newNumbersList.add("1")
    }


    for (q in newNumbersList) {
        final += q.toInt()
    }
    println(final)

}

