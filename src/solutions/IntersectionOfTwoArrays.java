package solutions;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> newSet = new HashSet<>();

        for (int j : a) {
            set.add(j);
        }

        for (int j : b) {
            if (set.contains(j)) {
                newSet.add(j);
            }
        }

        int[] result = new int[newSet.size()];
        int index = 0;
        for(Integer i : newSet) {
            result[index++] = i;
        }

        return result;
    }
}
