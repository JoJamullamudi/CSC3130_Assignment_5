import java.util.ArrayList;
import java.util.List;

public class RadixSort {

    public static String[] radix( String[] vals)
    {
        int maxlength = -;
        for ( int a = 0; a < vals.length; a++)
        {
            if ( maxlength < vals[a].length()) // looks through the array and finds the longest string.
            {
                maxlength = vals[a].length();
            }
        }

        for ( int b = maxlength - 1; b >= 0; b-- )// starts at the right most letter of the longest string and sorts down to the first.
        {
            buckets(vals, b); // calls the buckets method for the new sort.
        }

        return vals;
    }

    public static void buckets( String[] vals, int position)
    {
        int len = vals.length;
        List<String>[] Buckets = new ArrayList[256]; // creates the buckets to place all the strings

        for ( int a = 0; a < 256; a++)
        {
            Buckets[a] = new ArrayList<>(); // creates amn empty list at each bucket so we can add as many strings as needed
        }

        for ( int b = 0; b < vals.length; b++ )
        {
            if ( position < vals[b].length())// checks to see if were at a valid position for each string
            {
                Buckets[vals[b].chatAt(position)].add(vals[b]); // gets tje ascii value you of the position and places string accordingly
            }
            else {
                Buckets[0].add(vals[b]); //if
            }
        }

    }

}
