for (value in 0..3){
    println(value)
}
//range + step
for (value in 1..10 ){
    println(value)
}
for(value in 5 downTo 0){
    println("다운 $value")
}
val numbers = mutableListOf<Int>(5,6,7,8)
for(number in numbers){
    println(number)
}
for(i in 0..numbers.size){
    println("반복4")

}
for(i in 0 until numbers.size){//0..3
    println("반복5")
}

for((sex,number)in numbers.withIndex()){
    println(""+sex+"|"+number)
}

// forEach
numbers.forEach { number ->
    print(number)
}
