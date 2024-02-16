val number1: Int = 10

if(number1==10){
    println("넘버는 10입니다")
}else if(number1==20){
    println("넘버는 20입니다")
}else{
    println("넘버는 10도아니고 20도 아닙니다.")
}

if(number1==10) println("넘버는 10입니다")
else if (number1==20) println("넘버는 20입니다.")
else println("아무것도아닙니다")

val number2:Int = 10+20
val number3:Int = if(number2==30) 40 else 50
println(number3)
// 표현과 식
// 표현
// - 어떤 것을 표현 하기 위해서 사용되는 문법적인 요소
// - val, var, Int, Short -> 키워드
// 식
// - 값을 만들어 낸다
// - 10+20, 10*20,

//when
val number4: Int =5
when(number4){
    5->{
        println("5입니다")
    }
    6->{
        print("6입니다.")
    }
    else->{
        println("모르겠습니다")
    }
}
 when(number4){
     5-> println("5임")
     6-> println("6임")
     else-> println("나도 모름")
 }
when(number4){
    4-> println("number is 4")
    "안녕하세요"-> println("hello")
    is Boolean-> println("Boolean")
}
when(number4){
    in 1..10-> println("number is in 1..10")
    in 20..30-> println("number is in 20..30")
    in 40..30->println("number is in 30..40")
}