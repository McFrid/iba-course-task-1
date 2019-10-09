package by.iba;

class InsertSort {

    int[] sort(int[] array) {
        if (array == null){
            array = new int[]{};
        }

        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        return array;
    }
}
