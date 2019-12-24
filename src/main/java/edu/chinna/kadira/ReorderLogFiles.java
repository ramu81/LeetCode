package edu.chinna.kadira;

import static java.util.Arrays.stream;

public class ReorderLogFiles {
    public static void main(String[] args) {
        String[] lArr = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        //out put : "let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"

        stream( new ReorderLogFiles().reorderLogFiles( lArr ) )
                .forEachOrdered( System.out::println );
    }

    public String[] reorderLogFiles(String[] logs) {

        return stream( logs ).sorted( (s1, s2) -> {

            //Each log is a space delimited string of words
            int s1si = s1.indexOf( ' ' );
            int s2si = s2.indexOf( ' ' );
            char s1fc = s1.charAt( s1si + 1 );
            char s2fc = s2.charAt( s2si + 1 );

////Each word after the identifier will consist only of digits
            if (s1fc <= '9')
                if (s2fc <= '9') return 0;
                else return 1;

            if (s2fc <= '9') return -1;
//Each word after the identifier will consist only of lowercase letters
            int preCompute = s1.substring( s1si + 1 ).compareTo( s2.substring( s2si + 1 ) );
            if (preCompute == 0) return s1.substring( 0, s1si ).compareTo( s2.substring( 0, s2si ) );
            return preCompute;
        } ).toArray( String[]::new );
    }
}
