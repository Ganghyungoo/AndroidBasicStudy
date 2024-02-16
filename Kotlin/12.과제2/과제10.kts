fun makemap(list1:List<Int>,list2:List<Int>):Map<String,List<Int>>{
    var result= mutableMapOf<String,List<Int>>()
    var evenNum=mutableListOf<Int>()
    var oddNum= mutableListOf<Int>()
    for((index,value) in list1.withIndex()){
        if(value%2==0){
            evenNum.add(value)
        }else oddNum.add(value)
    }
    for((index,value) in list2.withIndex()){
        if(value%2==0){
            evenNum.add(value)
        }else oddNum.add(value)
    }
    result.put("짝수",evenNum)
    result.put("홀수",oddNum)
    return result
}
println(makemap(listOf(1,2,3,4,5),listOf(6,7,8)))
