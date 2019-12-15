package Helpers;

import java.util.HashMap;
import java.util.Map;

public class Bigram {
    public static Map<String, Double> getBigram(String txt)
    {
        HashMap<String, Double> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < txt.length() - 1; i++)
        {
            StringBuilder gram = new StringBuilder();
            for (int j = i; j < i + 2; j++)
            {
                gram.append(txt.charAt(j));
            }


            map.put(gram.toString(), map.containsKey(gram.toString()) ? map.get(gram.toString()).doubleValue() + 1.0 : 1.0);
            count++;
        }

        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            entry.setValue((double)(entry.getValue() / count));
        }

        return map;
    }

    public static Map<String, Double> compareRefs(Map<String, Double> ciphRefs, Map<String, Double> refs)
    {
        HashMap<String, Double> map = new HashMap<>();

        for (Map.Entry<String, Double> entry : ciphRefs.entrySet())
        {
            map.put(entry.getKey(), Math.abs(refs.get(entry.getKey()).doubleValue() - entry.getValue()));
        }

        return map;
    }
}
