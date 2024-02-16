class Calculater3(var result:Int=0) {
     fun calculate(operater:List<Char>,Num:List<Int>){
          Num.forEachIndexed { index, i ->
               _calculate(operater[index],i)
          }
     }
     fun _calculate(operater:Char,num:Int){
          if(operater=='+'){
               result+=num
          }
          else if (operater=='-'){
               result-=num
          }
          else if (operater=='*'){
               result*=num
          }
          else if (operater=='/'){
               result/=num
          }
          else{
               println("잘못된 연산입니다.")
          }
     }
     }
val test=Calculater3(3)
test.calculate(listOf<Char>('+','-','+','*'),listOf<Int>(1,2,3,4))
println(test.result)
