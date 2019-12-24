package edu.chinna.kadira;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMerge {
    public static void main(String[] args) {
        Map<Integer, List<String>> aMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add( "Kondapalli" );
        aMap.computeIfAbsent( 1, k -> new ArrayList<>() ).add( "value" );
        System.out.println( aMap );
    }
}
