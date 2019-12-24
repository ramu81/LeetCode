package edu.chinna.kadira;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static java.lang.System.out;
import static java.util.Arrays.stream;
import static java.util.Comparator.reverseOrder;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

/*
    Given a non-empty array of integers, return the k most frequent elements.
 */
public class TopKFrequent {
    public static void main(String[] args) {
        out.println( new TopKFrequent().topKFrequent( new int[]{1, 1, 1, 2, 2, 3}, 2 ) );
    }

    private List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Long> aMap = stream( nums ).boxed()
                .collect( groupingBy( identity(), counting() ) );

        Map<Integer, Long> result = aMap.entrySet().stream()
                .sorted( Entry.comparingByValue( reverseOrder() ) )
                .collect( toMap( Entry::getKey, Entry::getValue, (key, val) -> val, LinkedHashMap::new ) );

        return result.keySet().stream()
                .limit( k )
                .collect( toList() );
    }
}
