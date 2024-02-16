//Range
val range1=1..10
println(range1)
val range2=1 until 10//1..9
println(range2)
val range3='ㄱ'..'ㅎ'
println(range3)

//Progression
val range4= 1..10 step 2
println(range4)
val range5=10 downTo 1 step 2
println(range5)
//STEP
//-특징 : step의 값과는 별개로 무조건 index 0부터 시작한다.

//Collection
val collection1=listOf<int>(1,2,3,4,5)