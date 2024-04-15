package chpt_053

import chpt_052.File
import chpt_052.FilesystemItem

fun main() {
    val folder: IterableFolder = createRootFolder()
    for (item: FilesystemItem in folder) {
        // ...
    }
}

class IterableFolder(val items: List<FilesystemItem>) : FilesystemItem, Iterable<FilesystemItem> {
    override val sizeInBytes: Int = 0

    override fun iterator() = object : Iterator<FilesystemItem> {
        override fun hasNext(): Boolean {
            TODO("Not yet implemented")
        }

        override fun next(): FilesystemItem {
            TODO("Not yet implemented")
        }
    }
}

fun createRootFolder(): IterableFolder {
    return IterableFolder(
        listOf(
            File(), File(), IterableFolder(
                listOf(
                    File()
                )
            )
        )
    )
}