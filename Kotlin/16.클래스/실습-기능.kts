

class FootballPlayer constructor(uniform:String,ball:String){
    val uniform:String
    val ball:String
    init {
        this.uniform=uniform
        this.ball=ball
    }
    fun kick(){
        println("공은 찬다")
    }
    fun pass(){
        println("패스를 한다.")
    }
}
val footballPlayer=FootballPlayer("빨간색 유니폼","축구공")
footballPlayer.kick()
val footballPlayer2=FootballPlayer("파란색 유니폼","축구공")
footballPlayer2.pass()