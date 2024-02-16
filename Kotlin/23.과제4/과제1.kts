open class Warrior(var hp:Int, var power:Int, var armor:Int, var isLife:Boolean=true,var killCount:Int=0){
   open fun attack(monster: Monster){
        if(isLife){
        var damage:Int=0
        damage=this.power-monster.m_armor
        println("Warrior가 공격합니다.")
        if (damage>0){
            monster.defence(this,damage)
            }else println("워리어의 공격이 막혔습니다.")
        }else{
            println("워리어가 죽어서 공격할 수 없습니다.")
        }
    }
    fun defence(monster: Monster,damage:Int){
        this.hp-=damage
        if(this.hp<=0){
            this.hp=0
            println("워리어가 죽었습니다")
            this.isLife=false
        }
        else{
            println("워리어의 남은체력:$hp")
        }
    }
    fun levelUp():Knight?{
        if(this.killCount>5){
            println("Knight로 레벨업!!!")
         return Knight(this)
        }else {
            println("레벨업을 할 수 없습니다. 부족한 killCount:${5 - killCount}")
            return null
        }
    }
}
class Knight constructor(warrior:Warrior):Warrior(warrior.hp,warrior.power,warrior.armor){
    var energy:Int=0
    init {
        this.hp=warrior.hp
        this.power=warrior.power
        this.armor=warrior.armor
    }

    override fun attack(monster: Monster) {
        super.attack(monster)
        this.energy+=1
    }
    fun hardAttack(monster: Monster){
        if(this.energy>=3&&monster.m_isLife){
            monster.m_hp-=this.power+30
            this.energy-=3
        }else{
            println("에너지가 부족합니다. 부족한 에너지:${3-energy}")
        }
    }
}


class Monster(var m_hp:Int, var m_power:Int, var m_armor:Int, var m_isLife:Boolean=true){
    init {
        println("몬스터 생성")
    }
    fun attack(warrior: Warrior){
        if(m_isLife){
        var damage:Int=0
        damage=this.m_power-warrior.armor
        println("몬스터가 공격합니다.")
        if (damage>0){
            warrior.defence(this,damage)
            }else println("몬스터의 공격이 막혔습니다.")
        }else println("몬스터가 죽어있어서 공격이 불가능합니다.")
    }
    fun defence(warrior: Warrior,damage:Int){
        this.m_hp-=damage
        if(this.m_hp<=0){
            this.m_hp=0
            println("몬스터가 죽었습니다")
            m_isLife=false
            warrior.killCount+=1
            println("워리어 업그레이드까지 ${10-warrior.killCount}마리 남음")
        }
        else{
            println("몬스터가 아직 살아있습니다. 남은체력:$m_hp")
        }
    }
}
val warrior=Warrior(1,10,5)
loop@while(warrior.killCount<10){
    val monster=Monster(15,8,1)
    while(monster.m_isLife){
        warrior.attack(monster)
        monster.attack(warrior)
        if(!warrior.isLife){
            break@loop
        }
    }
}
val knight:Knight?=warrior.levelUp()

