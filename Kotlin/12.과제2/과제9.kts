fun makegugu(num:Int):List<Int>{
    var result=mutableListOf<Int>()
    for(i in 1..9){
        result.add(i*num)
    }
    return result
}
print(makegugu(3))