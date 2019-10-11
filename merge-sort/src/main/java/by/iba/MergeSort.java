package by.iba;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class MergeSort {
    int[] sort(int[] array) {
        if(array==null || array.length==0)
            return null;
        int[] res = new int[array.length];
        List<Integer> list = new ArrayList<Integer>();
        for(Integer i:array){
            list.add(i);
        }
        Collections.sort(list);
        int i = 0;
        for(Integer j : list){
            res[i++] = j;
        }
        return res;
    }
}
