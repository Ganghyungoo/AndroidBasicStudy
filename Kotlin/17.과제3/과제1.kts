/*
계산기1
- 사칙연산에 대응하는 4개의 함수 구현
- 연산이 한번 이루어 질 때 마다 출력을 해야 한다
(사칙 연산에 대응하는 4개의 함수에서 출력을 하면 안된다)*/
class Calculater{
    var result:Int=0
    set(value) {
        field=value
        println("중간 연산 결과: $value")
    }
    fun plus(inputNum:Int){
        result+=inputNum
    }
    fun minus(inputNum:Int){
        result-=inputNum
    }
    fun multiplication(inputNum:Int){
        result*=inputNum
    }
    fun division(inputNum:Int){
        result/=inputNum
    }
}
val calculater=Calculater()
calculater.plus(2)
calculater.multiplication(7)
calculater.division(8)
