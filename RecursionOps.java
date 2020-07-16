public class RecursionOps
{
    /**
     * calculates the area of a pyramid of canonnballs stacked on top of eachother
     * Ex: a pyramid of cannonballs with height 2 would return the number 5 due to having 1 cannonball on top supported by a 2X2 square
     */
    public static int countCannonballs(int height)
    {
        if(height > 1)
        {
            return height * height + RecursionOps.countCannonballs(height - 1);
        }
        else
        {
            return 1;
        }
    }
    
    //checks to see if a String is a palindrome
    public static boolean isPalindrome(String str)
    {
        if (str.length() == 1)
        {
            return true;
        }
        else if (str.charAt(0) == str.charAt(str.length() - 1))
        {
            return RecursionOps.isPalindrome(str.substring(1, str.length() - 1));
        }
        else
        {
            return false;
        }
    }
    
    //checks to see whether an equation is "balanced" (whether each grouping symbol has a pair)
    public static boolean isBalanced(String str)
    {
        if (str.length() == 0)
        {
            return true;
        }
        else if (str.indexOf("()") != -1 || str.indexOf("[]") != -1 || str.indexOf("{}") != -1)
        {
            if (str.indexOf("()") != -1)
            {
            String newStr = str.substring(0, str.indexOf("()"));
            newStr += str.substring(str.indexOf("()") + 2, str.length());
            return RecursionOps.isBalanced(newStr);
        }
        else if (str.indexOf("[]") != -1)
            {
            String newStr = str.substring(0, str.indexOf("[]"));
            newStr += str.substring(str.indexOf("[]") + 2, str.length());
            return RecursionOps.isBalanced(newStr);
        }
        else
        { String newStr = str.substring(0, str.indexOf("{}"));
            newStr += str.substring(str.indexOf("{}") + 2, str.length());
            return RecursionOps.isBalanced(newStr);
        }
    }
        else
        {
            return false;
        }
    }
}