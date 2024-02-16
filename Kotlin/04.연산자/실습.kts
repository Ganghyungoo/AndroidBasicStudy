//연산자
val number1 : Int = 1+10
val number2 : Int = 2-10
val number3 : Int = 2*40
val number4 : Float = 40/3F
val number5 : Int = 45%7
val number6 =10 * 32 / 2 % 3 + 108
println(number4)
println(number6)

//대입 연산자
var number7: Int = 22
println("바뀌기전 "+number7)
number7=100
println("바뀐 후 "+number7)

//복합대입연산자
//A+=B-> A = A + B
var number8: Int =12
number8+=8
number8-=10
number8*=2
number8/=5
println("결과는"+number8)

//증감연산자
var number9: Int =10
println(number9++)//10
println(number9)//11
println(++number9)//12

//비교연산자

val number10: Int = 1
val number11: Int = 2
val result: Boolean=number10>number11
println("boolean 결과"+result)
val result2: Boolean= number10==number11
println("boolean결과 2"+result2)
val result3: Boolean= number10!=number11
println("boolean 결과 3"+ result3)

// ===,!== ->잘 사용하지는 않는다.
// 위에 연산자는 주소값이 같은지 물어보는 연산자이다
// == !=는 값이 같은지 물어보는 것이다.

//논리연산자
val boolean1: Boolean= true
val boolean2: Boolean= false
val result4: Boolean= boolean1 && boolean2
val result5: Boolean= boolean1 || boolean2
println(result4)
println(result5)

