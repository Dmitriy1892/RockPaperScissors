fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")

    val gameChoise = getGameChoise(options)
}

fun getGameChoise(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]
