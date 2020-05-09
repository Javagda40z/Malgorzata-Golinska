package cwiczenia;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class DwieTablice {
    public static void main(String[] args) {

        int[] tab1 = {3, 6, 5, 1, 2};
        int[] tab2 = {15, 8, 6, 9, 1};

        int length = tab1.length + tab2.length;

        int[] tab3 = ArrayUtils.addAll(tab1, tab2);
        System.out.println(Arrays.toString(tab3));
    }
}
