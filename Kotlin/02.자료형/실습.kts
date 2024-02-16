val byteInt: Byte=10
val shortInt:Short=10
val intergerInt: Int = 10
val longInt:Long =10
//val wrongByte:Byte =1000->Byte가 표현할 수 있는 수 범위보다 커서 오류가 남
//val wrongByte:Byte ="안녕하세요"->타입 미스매치 에러발생

val floatNumber: Float=10.0f
val doubleNumber:Double=10.0
//val doubleMumber1:Double=10//Double은 소수점이 존재해야함

//타입 추론
val number1=10//int
val number2=10.0//double

//논리형
val yes:Boolean=true
val no: Boolean=false

//문자형
val text1:Char='A'
//val text2:Char='AA'->Char형은 문자가 반드시 하나만 들어가야한다
//val text3:Char="A"->타입 미스 매치에러 발생(char는'')

//문자열형
val text4:String="안녕하세요"
val text5:String="A"

//팁
//-타입을 설정할 때는 가장 작은 자료형을 사용하는 것이 좋다(컴퓨터의 메모리를 작게 사용한다.)
//    -실제로는 int,double을 사용하기는 한다.

//변수명
// val val : Int = 10->코틀린에서 선점해서 사용하고 있는 키워드는 변수명으로 사용할 수 없다.