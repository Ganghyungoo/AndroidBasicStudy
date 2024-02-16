val score=listOf<Int>(70,71,72,77,78,79,80,82,90,99)
fun examresult(list: List<Int>):List<Boolean>{
    var result=mutableListOf<Boolean>()
    for(i in list){
        if (i>=80)result.add(true)
        else result.add(false)
    }
    return result
}

fun examresult2(score:List<Int>):BooleanArray{
    var result=BooleanArray(score.size,{false})
    score.forEachIndexed { index, i ->
        if(i>=80){
            result[index]=true
        }
    }
    return result
}
val result2 = examresult(score)
var list= mutableListOf<Int>()


result2.forEach {
    print(" "+it)
}