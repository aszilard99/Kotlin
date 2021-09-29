package dictionary

import java.io.File

object ListDictionary : IDictionary {
    val dict: IDictionary = ListDictionary
    val words = mutableListOf<String>()

    init {
        //kell meg ellenorizni a file-t
        File(IDictionary.fileName).readLines().forEach{(add(it))}
    }
    override fun add(word: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun find(word: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun size(): Int {
        TODO("Not yet implemented")
    }
}