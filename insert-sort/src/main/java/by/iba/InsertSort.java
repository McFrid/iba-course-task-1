package by.iba;

class InsertSort {

    int[] sort(int[] array) {

        for(int i = 1; i < array.length; i++) {
            int new_element_place = find_place(i, array[i], array);  //Поиск позиции (бинарный)
            System.out.print("\n\nElement: " + array[i] + "\nNew place: " + new_element_place);
            swap(new_element_place, i, array); //поместить элемент на позицию
            for(int j = i; j > new_element_place+1; j--) {//сдвинуть остальные элиементы отсортированной части
                swap(j, j-1, array);
            }
            System.out.println("\nSorted array: "); //промежуточная проверка
            for (int p = 0; p < array.length; p++) {
                System.out.print(array[p] + "\t");
            }
        }

        return array;
    }

    private static int find_place(int subarray_length, int t, int array[]) {
        int left = 0, right = subarray_length, index = (left + right) / 2;

        while(left <= right) {
            index = (left + right) / 2;
            if (t >= array[index] && t <= array[index+1]) { return index+1; }
            if (t > array[index]) { left = index+1; }
            else { right = index-1; }
        }
        return index;
    }

    private static void swap(int a, int b, int array[]) {
        int buf = array[a];
        array[a] = array[b];
        array[b] = buf;
    }
}

