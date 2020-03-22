package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val totalSum = bill.sum();
        val eachSum = (totalSum - bill[k]) / 2;

        return if (b == eachSum) "Bon Appetit" else (b - eachSum).toString()
    }
}
