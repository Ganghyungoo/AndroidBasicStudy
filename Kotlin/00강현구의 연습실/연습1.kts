class GalaxyZ4 constructor(color:String){
    val color:String
    var luxury:String="기본"
    init {
        this.color=color
    }
    constructor(color:String ,luxary:String):this(color){
        this.luxury=luxary
    }
    fun inform(){
        println("귀하의 z플립은 ${this.color} 이며 $luxury 입니다.")
    }
}
val myPhone=GalaxyZ4("크림색","구찌")
myPhone.inform()