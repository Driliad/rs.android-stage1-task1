package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val sadMutableList = sadArray.toMutableList();
        var isHappy: Boolean = false;

        while (!isHappy) {
            isHappy = true;
            var count = sadMutableList.count() - 1;
            var i = 1;

            while (i < count) {
                val sum = sadMutableList[i - 1] + sadMutableList[i + 1];

                if(sum < sadMutableList[i]) {
                    sadMutableList.removeAt(i);
                    isHappy = false;
                    count--;
                }

                i++;
            }
        }

        return sadMutableList.toIntArray();
    }
}
