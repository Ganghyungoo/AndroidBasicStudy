fun plusNullableNum(num1:Int?,num2:Int?):Int{
/*    if(num1==null){
        num1=0
    }
    if(num2==null){
        num2!!=0
    }
    return num1+num2*/

    var num11:Int=if(num1==null) 0 else num1
    var num22:Int=if(num2==null) 0 else num2
    return num11+num22
}
print(plusNullableNum(null,null))