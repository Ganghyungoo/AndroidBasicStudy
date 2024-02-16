//6. 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수를 만드시오
fun sum6():List<List<Int>>{
    var box = mutableListOf<List<Int>>()
    for(i in 1..6){
        for(j in 1..6){
            if(i+j==6){
                box.add(listOf(i,j))
            }
        }
    }
    return box
}
print(sum6())
