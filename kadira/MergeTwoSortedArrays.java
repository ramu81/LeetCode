package edu.chinna.kadira;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        List<Integer> list1 = asList( 1, 2, 4 );
        List<Integer> list2 = asList( 1, 3, 4 );
        System.out.println( new MergeTwoSortedArrays().mergeTwoSortedArrays( list1, list2 ) );
    }

    private List<Integer> mergeTwoSortedArrays(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        result.addAll( list1 );
        result.addAll( list2 );

        return bubbleSort( result );
    }

    private List<Integer> bubbleSort(List<Integer> result) {
        int length = result.size();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (result.get( j ) > result.get( j + 1 )) {
                    Integer temp = result.get( j );
                    result.set( j, result.get( j + 1 ) );
                    result.set( j + 1, temp );
                }
            }
        }
        return result;
    }


}
