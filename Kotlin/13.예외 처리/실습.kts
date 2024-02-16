val number = listOf<Int>(1,2,3)
try{
    number.get(5)
}catch(exception:Exception){
    println(exception)
}

try{
    number.get(5)
}catch(exception:IllegalArgumentException){
    println("예외 발생 A")
}catch(exception:ArrayIndexOutOfBoundsException){
    println("예외 발생 B")
}finally {
    println("마지막")
}
