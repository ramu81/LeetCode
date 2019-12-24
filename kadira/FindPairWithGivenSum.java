package edu.chinna.kadira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a list of positive integers nums and an int target, return indices of the two numbers
 * such that they add up to a target - 30.
 * <p>
 * Conditions:
 * <p>
 * You will pick exactly 2 numbers.
 * You cannot pick the same element twice.
 * If you have muliple pairs, select the pair with the largest number.
 */
public class FindPairWithGivenSum {
    public static void main(String[] args) {
        List<Integer> aList = Arrays.asList( 1, 10, 25, 35, 60 );
        System.out.println( new FindPairWithGivenSum().findPairWithGivenSum( aList, 90 ) );
    }

    List<Integer> findPairWithGivenSum(List<Integer> a, int target) {
        List<Integer> list = new ArrayList<>();
        for (Integer ele : a) {
            if (a.contains( target - ele )) {
                list.add( a.indexOf( ele ) );
                list.add( a.indexOf( target - ele ) );
                break;
            }
        }
        return list;
    }
}
