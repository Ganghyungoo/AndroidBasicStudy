//getter/setter
class Book(){
    var title: String="모름"
    get() {
        return field
        }
    set(value) {
        field=value
    }
}
/*val book =Book()
println(book.title)
book.title="제목변경"
println(book.title)*/

class MasterBook(){
    lateinit var title :String

    fun nextpage(){
        if(::title.isInitialized==true){
        println("페이지가 넘어간다.")
        }else{
            println("초기화가 필요합니다")
        }
    }

}
val book =MasterBook()//MasterBook->거푸집 book->객체,찍어낸거
book.title="책이름"
println(book.nextpage())

val book2=MasterBook()//MasterBook->거푸집 book2->객체,찍어낸거
println(book2.nextpage())

//Lazy
// -호출시점에 by lazy정의에 의해서 초기화 수행한다.
// -val에서만 사용이 가능하다.
class Book3{
    val title:String by lazy {
        //본문->다른 작업도 할 수 있지만 반드시 프로퍼티를 초기화 시켜주는 작업을 해야한다.
        println("lazy 초기화")//다른
        //엄청 복잡한 작업이 있다고 가정한다.론
        "책 제목"
    }
}
val book3=Book3()
println(book3.title)