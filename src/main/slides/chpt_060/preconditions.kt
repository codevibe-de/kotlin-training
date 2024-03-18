package slides.chpt_060

const val acceptingInput = false


fun foo(v: Int, name: String?) {
    require(v % 2 == 0) { "Argument 'v' must be an even number" }
    requireNotNull(name) { "Argument 'name' must not be null" }

    check(acceptingInput) { "Sorry, not accepting input right now" }

    // do stuff
    error("Execution overtime...")
}

