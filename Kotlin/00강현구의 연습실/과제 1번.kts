import java.awt.List
import java.util.ArrayList

fun exam1():Unit{
    val name:String="hyun"
    for(i in name){
        println(i)
    }
}
fun exam2(num:Int):Int{
    var sum:Int=0
    for(i in 1..num){
        sum+=i
    }
    return sum
}

fun exam3():Int{
    var sum:Int=0
    for(i in 1..100){
        if(i%7==0){
            sum+=i
        }
    }
    return sum
}

fun exam4(data:Int):Int{
    var data2=data
    if(data<100){
        while(data2<100){
            data2++
        }
        return data2
    }else return 0
}


fun exam5(list:List<Int>):Array<Boolean>{
    var list2=Array<Boolean>(10,false)
    for(i in 0..list.size()-1){
        if(list.get(i)>=80){
            list2[i]=true
        }
    }
    return list2
}

fun examresult(list:List<Int>):List<Boolean> {
    var result=mutableListOf<Boolean>()
    for(i in list){
        if (i>=80)result.add(true)
        else result.add(false)
    }
    return result
}
val score=listOf<Int>(70,71,72,77,78,79,80,82,90,99)
val result2 = examresult(score)
print(result2)
