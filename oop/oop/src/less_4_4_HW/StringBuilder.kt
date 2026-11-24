package less_4_4_HW

class TextMerger {
    fun mergeText(lines: List<String>): String {
        val result = StringBuilder()
        for (line in lines) {
            result.append("$line\n")
        }
        return result.toString()
    }
}