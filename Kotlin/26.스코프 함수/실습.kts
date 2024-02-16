class Person(var name:String?=null,var age:Int?=null){}

//apply
//-적용하다
//-객체에 초기화 할때 사용하면 좋다.

val gildong=Person().apply{
    name="길동"
    age=20
}
//also
//유효성 검사할 때 좋다
//수신된 객체의 속성을 변경하지 않고 사용할때
val gildong2=Person("victor").also{
    //nameIsGildong(it.name)
}
//run
//-기본적으로 apply와 동일하다
//스코프와 마지막 줄을 리턴한다->특정 계산결과가 필요한 경우
val ageAfter10Year=Person("gildong",10).run{
    age!!+10
}
//-with는 nullable타입을 받지 못한다.
val ageAfter10Year2=with(Person("gildong",10)){
    age!!+10
}
println(ageAfter10Year2)

//let
//기본적으로 also와 동일하다.
//스코프의 마지막 줄을 리턴한다.
val gildong2=Person("victor").let{
    //nameIsGildong(it.name)
}