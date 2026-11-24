fun showCurrentBookPage(bookPages: Array<String>, currentPage: Int) {
    println(bookPages[currentPage - 1])
}

fun showNextBookPage(bookPages: Array<String>, currentPage: Int): Int {
    val nextPage = if (currentPage < bookPages.size) currentPage + 1 else currentPage
    println(bookPages[nextPage - 1])
    return nextPage
}

fun showPreviousBookPage(bookPages: Array<String>, currentPage: Int): Int {
    val prevPage = if (currentPage > 1) currentPage - 1 else currentPage
    println(bookPages[prevPage - 1])
    return prevPage
}