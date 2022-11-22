fun main() {
    print(solution("craZy"))
}

fun solution(inputString: String): String {
    var tempString = ""
    val shift = 1 // can be taken as parameter
    for (i in inputString.indices) {
        if (inputString[i] == 'z' || inputString[i] == 'Z') {
            tempString += (inputString[i].code - 26 + shift).toChar()
            continue
        }
        tempString += (inputString[i].code + 1).toChar()
    }
    return tempString
}