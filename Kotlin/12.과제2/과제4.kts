fun under100(N:Int):Unit{
    for(i in N..100){
        if(i==100){
            println("100이되서 종료합니다")
            break
        }
        else println(i)
    }
}
fun under1002(N:Int):Unit{
    var N2:Int=N
    while(N2<100){
        N2++
        println(N2)
    }
    print("100이되어 종료합니다.")
    return
}
under1002(7)