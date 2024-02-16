//상속을 진행하기전
class Warrior(){
    fun attack(){
        println("복잡한 코드 +공격 ")
    }
}

class DefenceWarrior(){
    fun attack(){
        println("복잡한 코드 +공격 ")
    }
    fun defence(){
        println("방어")
    }
}

class HardAttackWarrior(){
    fun attack(){
        println("복잡한 코드 +공격 ")
    }
    fun hardAttack(){
        println("강하게 공격")
    }
}
//-----------------------------------------
//상속을 사용
open class Warrior1(var name:String, var power:Int, var type:String){//부모/슈퍼 클래스
    fun attack(){
        println("복잡한 코드 +공격 ")
    }
}
//주 생성자가 슈퍼클래스 생성하는 경우.
class DefenceWarrior1 constructor(name:String,power:Int):Warrior1(name,power,"고블린"){
    fun defence(){
        println("방어")
    }
}
//주 생성자가 없는 경우
class HardAttackWarrior1:Warrior1{
    var bonuspower:Int=0
    constructor(name:String, power:Int,bonusPower:Int):super(name,power,"골렘"){
        this.bonuspower=bonusPower
    }
    fun hardAttack(){
        println("강하게 공격")
    }
}
val defenceWarrior:DefenceWarrior1=DefenceWarrior1("똑똑한 고블린",100)
defenceWarrior.defence()
defenceWarrior.attack()

val hardAttackWarrior1:HardAttackWarrior1=HardAttackWarrior1("멍청한 골렘",100,20)
hardAttackWarrior1.attack()
hardAttackWarrior1.hardAttack()