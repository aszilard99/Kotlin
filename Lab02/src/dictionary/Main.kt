package dictionary

fun main(){
    val dict: IDictionary = ListDictionary
    println("num of words: ${dict.size()}")
    var word: String?
    while(true){
        print("what to find?")
        word = readLine()
        if (word.equals("quit")){
            break
        }
        println("Result: ${word?.let {dict.find(it)}}")
    }
}