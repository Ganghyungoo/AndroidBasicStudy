//while문 실습

var i = 0
while (i<5){
    println(i)
    if(i%2==0){
        println("짝수입니다.")
    }else{
        println("홀수입니다.")
    }
    i++//이부분을 제거하면 무한 루프에 빠지게 된다.
}
var z=10
do{
    println("시작")
    z++
}while(z<20)