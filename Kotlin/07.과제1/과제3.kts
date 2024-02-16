var score:Int?=81

fun checkScore(score:Int?) {
    if (score!! >= 90) {
        println("A학점입니다")
    } else if (score!! >= 80 && score!! <= 89) {
        println("B학점입니다")
    } else if (score!! >= 70 && score!! <= 79) {
        println("C학점입니다.")
    } else {
        println("F학점입니다.")
    }
}
checkScore(score!!)