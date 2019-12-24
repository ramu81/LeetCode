package edu.chinna.kadira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Description:
 * Implement a function to return product suggestions using products from a product repository after each character
 * is typed by the customer in the search bar. If there are more than THREE acceptable products, return the product
 * name that is first in the alphabetical order. Only return product suggestions after the customer has entered two
 * characters. Product suggestions must start with the characters already typed. Both the repository and the
 * customer query should be compared in a CASE-INSENSITIVE way.
 * <p>
 * Input:
 * The input to the method/function consist of three arguments:
 * <p>
 * numProducts, an integer representing the number of various products in Amazon's product repository;
 * repository, a list of unique strings representing the various products in Amazon's product repository;
 * customerQuery, a string representing the full search query of the customer.
 * Output:
 * Return a list of a list of strings, where each list represents the product suggestions made by the system as
 * the customer types each character of the customerQuery. Assume the customer types characters in order without
 * deleting/removing any characters.
 * <p>
 * Example:
 * Input:
 * numProducts = 5
 * repository = ["mobile", "mouse", "moneypot", "monitor", "mousepad"]
 * customerQuery = "mouse"
 * <p>
 * Output:
 * [["mobile", "moneypot", "monitor"],
 * ["mouse", "mousepad"],
 * ["mouse", "mousepad"],
 * ["mouse", "mousepad"]]
 */
public class ProductSuggestions {
    public static void main(String[] args) {

        Arrays.stream( new ProductSuggestions()
                .findProductSuggestions( 5,
                        new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse" ) )
                .map( a -> Arrays.stream( a ).reduce( "", (c, b) -> c + "  " + b ) ).forEach( System.out::println );

        /**
         * Output:
         * [["mobile", "moneypot", "monitor"],
         * ["mouse", "mousepad"],
         * ["mouse", "mousepad"],
         * ["mouse", "mousepad"]]
         *
         */
    }

    private String[][] findProductSuggestions(int numProducts, String[] repository, String customerQuery) {
        List<List<String>> list = new ArrayList<>();
        customerQuery = customerQuery.toLowerCase();
        for (int i = 2; i <= customerQuery.length(); i++) {
            List<String> words = new ArrayList<>();
            String searchWord = customerQuery.substring( 0, i );
            for (String word : repository)
                if (word.toLowerCase().startsWith( searchWord ))
                    words.add( word );
            list.add( words.stream().sorted().limit( 3 ).collect( toList() ) );
        }
        return list.stream().map( a -> a.stream().toArray( String[]::new ) ).toArray( String[][]::new );
    }
}
