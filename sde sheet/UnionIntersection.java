
// Union and Intersection of two sorted arrays
import java.io.*;
import java.util.*;

public class UnionIntersection {
    public static ArrayList<Integer> Unionarray(int arr1[], int arr2[], int n, int m) {
        TreeSet<Integer> set = new TreeSet<>();
        for (Integer i : arr1) {
            set.add(i);

        }
        for (Integer i : arr2) {
            set.add(i);

        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : set)
            list.add(i);
        return list;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 2, 3 };
        int arr2[] = { 2, 3, 3, 4, 5, 5 };
        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> uni = Unionarray(arr1, arr2, n, m);
        for (int i : uni) {
            System.out.print(i + " ");
        }
    }
}
