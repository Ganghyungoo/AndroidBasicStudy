fun abc(group1:List<String>,
        group2:List<String>,
        rejectN:Int
):List<List<String>>?{
    var resultGroup = mutableListOf<List<String>>()
    var group1_1= mutableListOf<String>()
    var group2_1= mutableListOf<String>()
    if(group1.size<rejectN || group2.size<rejectN) return null
    for((index,value) in group1.withIndex()){
        if(index!=rejectN-1){
            group1_1.add(value)
        }
    }
    for((index,value) in group2.withIndex()){
        if(index!=rejectN-1){
            group2_1.add(value)
        }
    }
    resultGroup.add(group1_1)
    resultGroup.add(group2_1)
    return resultGroup
}
abc(listOf<String>("A", "B", "C", "D", "E"),  listOf("A", "B", "C"), 3)