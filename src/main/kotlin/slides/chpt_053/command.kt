package slides.chpt_053

import java.io.File

typealias Command = () -> Unit

object NoOpCommand : Command {
    override fun invoke() {}
}

class FileRenamerWithUndo {

    private var _undoCommand: Command = NoOpCommand

    fun rename(oldFilename: String, newFilename: String) {
        performRename(oldFilename, newFilename)
        _undoCommand = { performRename(newFilename, oldFilename) }
    }

    private fun performRename(oldFilename: String, newFilename: String) {
        val old = File(oldFilename)
        val new = File(newFilename)
        old.renameTo(new)
    }

    fun undoLast() {
        _undoCommand.invoke()
    }
}