package slides.chpt_030_ood

class SomeClass (
) {
    var s: String = ""  // must provide default
        set(value) {
            field = value
        }
    init {
        s = "bbvbv"
    }
}