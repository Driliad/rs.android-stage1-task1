package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        val sum = input.sum();
        var minSum = sum - input[0];
        var maxSum = sum - input[0];

        for (i in 1 until input.count()) {
            if (sum - input[i] < minSum) {
                minSum = sum - input[i];
            }

            if (sum - input[i] > maxSum) {
                maxSum = sum - input[i];
            }
        }

        return intArrayOf(minSum, maxSum);
    }
}
