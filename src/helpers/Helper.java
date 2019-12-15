package Helpers;

public class Helper {

    public static Integer[] convertKey(String key) {
        Integer[] intKey = new Integer[key.length()];
        int index = 0;
        boolean isNum = false;

        for (char c : key.toCharArray())
        {
            if (c >= '0' && c <= '9')
            {
                isNum = true;
                intKey[index++] = c - '0';
            }
        }

        if (isNum)
            return intKey;

        index = 1;

        char[] c = key.toLowerCase().toCharArray();

        for (char i = 'a'; i <= 'z'; i++)
        {
            for (int j = 0; j < key.length(); j++)
            {
                if (c[j] == i)
                {
                    intKey[j] = index++;
                }
            }
        }

        return intKey;
    }

}
