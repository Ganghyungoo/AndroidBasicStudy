//listOf
val numbers =listOf<Int>(1,2,3)
println(numbers[0])
println(numbers.get(1))
println(numbers.indexOf(3))
println(numbers.last())
println(numbers.first())
val numbers2 = mutableListOf<Int>(1,2,3)
println(numbers2.add(50))
println(numbers2)
numbers2.removeAt(0)
println(numbers2)
numbers2.addAll(2,listOf<Int>(100,200))
println("이거 뭘까?"+numbers2)
//Set
val numbers3=setOf<Int>(1,1,1,3,3,6,7,1,3,2)
val numbers4=mutableSetOf<Int>(1,1,1,1,1,3,3,3,4,4)
println(numbers3)
println(numbers3.contains(5))
println(numbers3.containsAll(setOf<Int>(1,3)))
numbers4.remove(1)
println(numbers4)

//Map
val numbers5=mapOf<Int,String>(1 to "one",2 to "two" )
println(numbers5.keys)
println(numbers5.values)
println(numbers5.size)
println(numbers5.get(1))
println(numbers5[2])
println(numbers5.getOrDefault(3,"디폴트값"))
val numbers6=mapOf<Int,String>(Pair(1,"one"), Pair(2,"two"))
//println(numbers5)
//println(numbers6)


