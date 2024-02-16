fun SumN(N:Int):Int{
    var sum=0
    for(i in 1..N){
        sum=sum+i
    }
    return sum
}
val result=SumN(10)
print(result)