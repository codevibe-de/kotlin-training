package chpt_030_ood

sealed interface PaginationState {

    data class Page(val page: Int) : PaginationState

    data object First : PaginationState

    data object Last : PaginationState

}


fun main() {
    val states = listOf(
        PaginationState.First,
        PaginationState.Page(2),
        PaginationState.Page(3),
        PaginationState.Last
    )
    for (s in states) println(s)
}