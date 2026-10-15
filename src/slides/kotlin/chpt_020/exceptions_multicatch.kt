package chpt_020

import java.io.FileNotFoundException
import java.io.IOException

fun main() {
    try {
        readSomething("/var/tmp/blah")
    }
    catch (e: IOException) {
        when (e) {
            // we want to handle this case:
            is FileNotFoundException -> println("not found")
            // whatever, just rethrow:
            else -> throw e
        }
    }
}

fun readSomething(path:String) {
    throw FileNotFoundException("Not found")
}