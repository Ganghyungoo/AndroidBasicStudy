fun sumX7():Int{
    var sum:Int=0
    for(i in 1..100)
        if(i%7==0){
            sum+=i
        }
    return sum
}

val result:Int=sumX7()
print(result)