import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Alphabetize
{
    //instance variables
    private ArrayList<String> list;

    //constructors
    
    public Alphabetize()
    {
        list = new ArrayList<String>();
    }

    //other methods
    
    /** adds word to list so that list remains alphabetized */
    public void add( String  word)
    {
        boolean unique = true;
        for (int i = 0; i < list.size(); i++)
        {
            if (word.equals(list.get(i)))
            {
                unique = false;
            }
        }
        if (unique)
        {
        list.add(this.findInsertLocation(word), word);
    }
    }

    /** returns the location in list where word would go to keep the list alphabetized */
    private int findInsertLocation( String word )
    {
        int j = 0;
        for(int i = 0; i < list.size(); i++)
        {
            if (word.compareTo(list.get(i)) <= -1 || word.compareTo(list.get(i)) == 0)
            {
                return i;
            }
            j++;
        }
        return j;
    }

    /** removes word from list and keeps list alphabetized */
    public void remove(String word)
    {
        list.remove(this.findInsertLocation(word));
    }

    /** returns a String containing all of the words in list */
    public String toString()
    {
        return "" + list;
    }
}
