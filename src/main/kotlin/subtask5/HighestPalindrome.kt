package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var highestPalindrome = digitString.toCharArray();
        var count = k;

        var start = 0;
        var end = n - 1;

        var differentNumbers = 0;

        while (start < end) {
            if (highestPalindrome[start] != highestPalindrome[end]) {
                val maxValue = maxOf(highestPalindrome[start], highestPalindrome[end]);
                highestPalindrome[start] = maxValue;
                highestPalindrome[end] = maxValue;

                count--;
            }

            start++;
            end--;
        }

        if (count < 0) {
            return "-1";
        }

        start = 0;
        end = highestPalindrome.count() - 1;

        while (start <= end) {
            if (start == end) {
                if (count > 0) {
                    highestPalindrome[start] = '9';
                }
            }

            if (highestPalindrome[start] < '9') {
                if (count >= 2 && highestPalindrome[start] == digitString[start] && highestPalindrome[end] == digitString[end]) {
                    count -= 2;
                    highestPalindrome[start] = '9';
                    highestPalindrome[end] = '9';
                } else if (count >= 1 && (highestPalindrome[start] != digitString[start] || highestPalindrome[end] != digitString[end])) {
                    count--;
                    highestPalindrome[start] = '9';
                    highestPalindrome[end] = '9';
                }
            }

            start++;
            end--;
        }

        return highestPalindrome.joinToString("");
    }
}
