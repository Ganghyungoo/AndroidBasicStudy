val number: Int? =null
//val number2:Int =null//nullable Int 형이 아니기 떄문에
println(number)
val number1: Int=2+5
val number2: Int=10
val number3: Int=number1+number2
println(number3)

val num1: Int? = 2+5
val num2: Int? = 10
//val num3: Int? = num1+num2//이건 왜 안되는 걸까?
//왜냐면 nullable 타입은 값을 읽을때 확실하지 않기때문에 연산을 할 수없다.
//그렇다면 어떻게 실행시켜줄까?
val num3:Int? =num1!!+num2!!
println(num3)
/*//이런 식으로 !!를 붙혀주면 null이아닌 값임을 보장해준다.
//하지만 실제로 null인 경우에는 NPE(NullPointException이 발생할 수있다)
//결론: 정말 100% 확신이 있는 경우가 아니면 !!를 사용하지 말자!*/
if(null==5) {
    println("same")
}else{
    println("not same")
}

if(null==null){//비교 연산은 가능하다.

    println("same")
}else{
    println("not same")
}


