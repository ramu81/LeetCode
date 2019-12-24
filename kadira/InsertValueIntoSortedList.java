package edu.chinna.kadira;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;
import static java.util.Arrays.asList;

public class InsertValueIntoSortedList {
    public static void main(String[] args) {
        List<Integer> list = asList( 0, 1, 3, 4, 6, 7, 8 );
        out.println( new InsertValueIntoSortedList().getSortedList( list, 5 ) );
    }

    List<Integer> getSortedList(List<Integer> list, Integer param) {
        List<Integer> temp = new ArrayList<>();
        boolean flag = false;
        for (Integer a : list) {
            if (a >= param && !flag) {
                temp.add( param );
                flag = true;
            }
            temp.add( a );
        }
        return temp;
    }
}
