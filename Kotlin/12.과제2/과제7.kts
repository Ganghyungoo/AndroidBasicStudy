fun eatgame( maxEat:Int, myEat:Int):Int{
    var maxEat2:Int = maxEat
    var myEat2:Int = myEat
    do {
        if(myEat2==maxEat2){
            println("배가 부르다")
            myEat2+=1
        }else{
            println("밥을 먹는다.")
            myEat2+=1
        }
    }while(myEat2<maxEat2+1)
    return myEat2
}
print(eatgame(4,4))


