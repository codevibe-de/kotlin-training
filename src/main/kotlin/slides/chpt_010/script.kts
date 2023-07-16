import java.io.File

println("Hello from a script!")

File("out.txt").run {
    writeText(foo())
}

fun foo(): String {
    return "blah"
}