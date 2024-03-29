//클래스를 선언하는 방법
class Person{}

//생성자
// - 주생성자
//  -클래스 이름 옆에 괄호로 둘러싸인 코드
//  -클래스를 통해서 객체를 만드는데 필요한 개료들을 적어준다
//        -재료이름(변수명):재료타입(변수타입)
//  -반드시 한개만 존재할 수 있다.
//    -constructor

//주생성자->풀버젼(생략이 없는 버젼)
class User1 constructor(name:String){
    val userName:String//클래스 속성은 init 블럭에서 초기화 된다.

    init {//클래스가 생성될때(클래스를 통해 객체를 만들때) 호출된다.
        println(name)
        userName=name
    }
}
//클래스를 호출하는 방법->클래스를 통해 객체를 만드는 방법
//클래스를 호출->인스턴스화
//객체 ->Object,Instance
//val user=User1("홍길동")

//주생성자->init생략하는 방법
class User2 constructor(name:String){
    val userName:String=name
}
//val user=User2("홍길동")

//주생성자->constructor를 생략하는 방법
class User3 (name:String){
    val userName:String=name
}
//val user=User3("홍길동")

//주생성자 -> 생략할 수 있는 모든걸 생략하는 방법
class User3(val name:String){

}

//주생성자 ->기본값
class User4(name:String="김아무개"){
    val userName:String=name
}
val user=User4()

//생성자에서 받는 속성이 복수개 인경우
class User5 constructor(age:Int,name:String){
    val age:Int
    val name:String

    init {
        this.age=age
        this.name=name
    }
}
val user5=User5(25,"강현구")
println(user5.age)
//.은 객체의 속성이나 기능을 사용할 때 사용한다.


//부생성자(Secondary Constructor)
//-constructor는 생략할 수 없다.
//- 주생성자엔 객체를 만들기위한 필수 조건이 있다면 부생성자에는 객체를 만들기 위한 옵션 조건이있다.
//부생성자는 주생성자에서 필요한 조건을 포함하고 있어야한다.(파라미터를 포함하고 있어야한다.)
//-부생성자는 주생성자에게 생성을 위임해야한다.
class User6 constructor(name:String){
    var age:Int=0
    val name:String
    var nickname:String=""
    init {
        println("init")
        this.name=name
    }
 //부생성자는 클래스명 우측에 올 수 없다.->클래스의 본문에 있어야 한다.
    constructor(name:String,age:Int):this(name) {
     println("second")
    this.age=age
    }
    //부생성자는 복수개 존재할 수 있다.
    constructor( name:String, age:Int,nickname:String): this(name){
        this.age=age
        this.nickname=nickname
    }
}
/*val user6=User6(name="가나다")
println(user6.name)*/
val user6_2=User6("가나다다",50)
println(user6_2.name)
//실행 순서
//부생성자 호춯->부생성자 안에있는 주생성자 호출 ->init 블록 호출->부생성자 본문 실행
//클래스 속성에서 초기화를 시켜주지 않어도 되는 이유
//  -초기화 블록에서 초기화를 보장해주기 떄문에 -> 클래스가 생성될때 초기화블록은 무조건 실행한다,
//  -초기화 블록에 없는 속성은 선언할때 초기화 해주어야한다.

class User7{
    val age:Int
    val name:String

    constructor(age:Int, name:String){
        this.age=age
        this.name=name
    }
}
val user7=User7(10,"가가가")
println(user7.age)
//주생성자가 업슨ㄴ 것처럼 보이고 부셍성자만 있을 떄 부생성자가 주생성자처럼 보인다,
//-> 부생성자가 맞다!
// -> 주생성자가 없기때문에 this()생성자를 이용해서 셍성을 위임할 필요가없다.