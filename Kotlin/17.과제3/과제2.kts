class Calculater2 constructor(val initialNum:Int=0){
    var result:Int=0
    set(value) {
        field=value
        println("중간 계산 결과: $value")
    }
    init {
        this.result=initialNum
    }
    fun calculater(operater:Char,num:Int){
        if(operater=='+'){
             result+=num
        }
        else if (operater=='-'){
             result-=num
        }
        else if (operater=='*'){
             result*=num
        }
        else if (operater=='/'){
             result/=num
        }
        else{
            println("잘못된 연산입니다.")
        }
    }
}
val test = Calculater2()
test.calculater('+',7)
