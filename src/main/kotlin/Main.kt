fun main() {
    campus()
   println(sentence("Jolly",20))
    println(sentence("possibility"))

    me("Cynthia")
    me("Marion")


}
fun sentence(name:String, age:Int):String{
    return ("Hi,my name is $name and i am $age years old")
}
fun sentence(word:String):String{
    return("the length of the word string is: "+word.length)
}
fun campus(){
    val name =("akirachix")
    println(name[0])
    println(name[3])
    println(name[4])


}
fun me(name:String){
    var mine  = "Cynthia"

    if ((name==mine)) {
        println("that's me ")
    }
    else{
        println("I don't know who that is")

    }
}



