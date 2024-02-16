//함수 사용시 지역성을 고려해야만한다.
fun plusNumbers(first_num:Int,second_num :Int):Int{
    val result:Int = first_num+second_num
    return result
}
plusNumbers(first_num = 10, second_num=20)//30
plusNumbers(10,20)//30

val result:Int = plusNumbers(first_num = 5, second_num=7)
println(result)

//기본값이 있는 함수를 선언하는 방법
fun plusNumbersWithDefault(first_num:Int, second_Num:Int=10):Int{
    return first_num+second_Num
}
val result2:Int = plusNumbersWithDefault(first_num=10)
println(result2)
val result3:Int =plusNumbersWithDefault(first_num=10, second_Num =20)
println(result3)

fun plusNumberWithNoReturn(first_num:Int, second_num:Int):Unit{//Unit을 생략해도 된다.
    val result:Int = first_num+second_num
    println(result)
    //return
}
plusNumberWithNoReturn(100,200)

//함수 선언을 간단하게 하는 방법
fun shortPlusNumber(firstNum:Int , secondNum:Int)=firstNum+secondNum
val result10: Int = shortPlusNumber(10,100)
println(result10)

//가변인자를 갖는 인수
fun plusMultipleNumbers(vararg numbers:Int):Unit{
    for(sex:Int in numbers){
        println(sex)
    }
}
plusMultipleNumbers(1,2,3,4,5)