// break
println("break---------------------------")
for (i in 1..3){// i반복문
    println("i : " + i)
    for (j in 1..3){//j반복문
        if (j==2) break //구문1
        else println("j : " + j) //구문2
    }
}
// i1 -> j1/구문1 -> j1/구문2 -> j2/구문1 -> i2 -> j1/구문1 -> j1/구문2 -> j2/구문1 -> i3...
println("break+label---------------------------")
//break+label
loop@for (i in 1..3){// i반복문
    println("i : " + i)
    for (j in 1..3){//j반복문
        if (j==2) break@loop //구문1
        else println("j : " + j) //구문2
    }
}

// i1 -> j1구문1 -> j1구문2 -> j2구문1 -> loop탈출(i반복문)
println("continue---------------------------")
// continue
for (i in 1..3){ //i반복문
    println("i : " + i)
    for (j in 1..3){//j반복문
        if (j==2) continue // 구문 1
        else println("j : " + j) // 구문2
    }
}
//i1 -> (j1/구문1 -> j1/구문2) -> (j2/구문1) -> (j3/구문1 -> j3->구문2) -> i2...
println("continue+label---------------------------")
loop@for (i in 1..3){ //i반복문
    println("i : " + i)
    for (j in 1..3){//j반복문
        if (j==2) continue@loop // 구문 1
        else println("j : " + j) // 구문2
    }
}
// i1 -> j1/구문1 -> j1/구문2 -> j2/구문 -> i2 -> j1/구문1 -> j1/구문2 -> i3 -> -> j1/구문1 -> j1/구문2
println("---------------------------")
fun returnFunction():Unit{
    for (i in 1..3){ //i반복문
        println("i : " + i)
        for (j in 1..3){//j반복문
            if (j==2) return // 구문 1
            else println("j : " + j) // 구문2
        }
    }
}
returnFunction()
println("foreach-------------------------------")
listOf(1,2,3).forEach loop@{
    if(it==2)return@loop
}