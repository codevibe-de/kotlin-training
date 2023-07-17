package slides.chpt_052

interface Sized {
    val sizeInBytes: Int
}

interface FilesystemItem : Sized

class File : FilesystemItem {
    override val sizeInBytes: Int
        get() = 1024

}

class Folder(val items: List<FilesystemItem>) : FilesystemItem {
    override val sizeInBytes: Int
        get() {
            return items.sumOf { item -> item.sizeInBytes }
        }
}
