public class ArrayOps
{
    public static int findMax(int [] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static String findLongestString(String [] arr)
    {
        int max = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].length() > arr[max].length())
            {
                max = i;
            }
        }
        return arr[max];
    }

    public static int averageStringLength(String [] arr)
    {
        if (arr.length == 0)
        {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i].length();
        }
        return (sum/arr.length);
    }
    //97 is 'a' in unicode
    public static int [] countLetterFrequencies(String str)
    {
        String test = str.toLowerCase();
        int [] frequency = new int [27];
        for (int i = 0; i < test.length(); i++)
        {
            if (test.charAt(i) - 97 > 0 && test.charAt(i) - 97 < 26)
            {
                frequency[test.charAt(i) - 96] += 1;
            }
        }
        return frequency;
    }

    public static int [] removeIntAndScoot(int [] arr, int i)
    {
        for (int k = i; k < arr.length - 1; k++)
        {
            arr[k] = arr[k + 1];
        }
        arr[arr.length - 1] = 0;
        return arr;
    }

    public static int [] resizeIntArray(int [] arr)
    {
        int [] newArr = new int [arr.length* 2];
        for (int i = 0; i < newArr.length; i++)
        {
            if (i < arr.length)
            {
                newArr[i] = arr[i];
            }
            else
            {
                newArr[i] = 0;
            }
        }
        return newArr;
    }

    public static String [] addNumToStringArray(String [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = ("#" + i + " " + arr[i]);
        }
        return arr;
    }

    public static int [] reverseIntArray(int [] arr)
    {
        int count = 0;
        count = arr.length/2;
        for(int i = 0; i < count; i++)
        {
            int numberAtEnd = arr[arr.length-(i + 1)];
            arr[arr.length- (i+ 1)] = arr[i];
            arr[i] = numberAtEnd;
        }
        return arr;
    }

    public static int [] sortIntArray(int [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int index = i;
            while (index != 0 && arr[index - 1] > arr[index])
            {
                int higherValue = arr[index-1];
                arr[index-1] = arr[index];
                arr[index] = higherValue;
                index--;
            }
        }
        return arr;
    }
}